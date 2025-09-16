package com.paaulooo.nexbackend.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false)
    String logout, Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (isAuthenticated(authentication)) {
            return  "redirect:/dashboard";
        }
        if (error != null) {
            model.addAttribute("error", "Usuário ou senha inválidos!");
        }

        if (logout != null) {
            model.addAttribute("message", "Logout realizado com sucesso!");
        }
        return "login";
    }

    private boolean isAuthenticated(Authentication authentication) {
        return authentication != null && authentication.isAuthenticated() &&
               !authentication.getName().equals("anonymousUser");
    }

    @GetMapping({"/", ""})
    public String home(){
        return "home";
    }

    @GetMapping("/dashboard")
    @PreAuthorize("isAuthenticated()")
    public String dashboard(Model model, Principal principal){
        model.addAttribute("username", principal.getName());
        return "dashboard";
    }

}
