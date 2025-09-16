package com.paaulooo.nexbackend.Controllers;


import com.paaulooo.nexbackend.Models.Colaborador;
import com.paaulooo.nexbackend.Services.ColaboradorService;
import com.paaulooo.nexbackend.dto.ColaboradorDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// CRUD MAPPINGS

@RestController
@RequiredArgsConstructor
@RequestMapping("/colaboradores")
public class ColaboradorController {
    private final ColaboradorService colaboradorService;

    @GetMapping
    public ResponseEntity<List<Colaborador>> findAll(){
        return ResponseEntity.ok(colaboradorService.showAllColaboradores());
    }

    @PostMapping
    public ResponseEntity<Colaborador> saveColaborador(@RequestBody @Valid ColaboradorDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(colaboradorService.save(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Colaborador> updateColaborador(@RequestBody @Valid ColaboradorDTO dto, @PathVariable Long id){
        return ResponseEntity.ok(colaboradorService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteColaborador(@PathVariable Long id){
        colaboradorService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
