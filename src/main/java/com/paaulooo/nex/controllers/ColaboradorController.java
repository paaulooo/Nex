package com.paaulooo.nex.controllers;


import com.paaulooo.nex.dto.ColaboradorDTO;
import com.paaulooo.nex.models.Colaborador;
import com.paaulooo.nex.services.ColaboradorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/colaborador")
public class ColaboradorController {

    private final ColaboradorService colaboradorService;

    @PostMapping
    public ResponseEntity<Colaborador> save(@RequestBody ColaboradorDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(colaboradorService.save(dto));
    }

    @GetMapping
    public ResponseEntity<List<Colaborador>> show() {
        return ResponseEntity.ok(colaboradorService.show());
    }

}
