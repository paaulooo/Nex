package com.paaulooo.nex.services;

import com.paaulooo.nex.dto.ColaboradorDTO;
import com.paaulooo.nex.models.Admin;
import com.paaulooo.nex.models.Colaborador;
import com.paaulooo.nex.repositories.ColaboradorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColaboradorService {
    private final ColaboradorRepository colaboradorRepository;

    public Colaborador save(ColaboradorDTO dto) {
        Colaborador colab = new Admin();
        colab.setNome(dto.getNome());
        colab.setCargo(dto.getCargo());
        colab.setArea(dto.getArea());
        colab.setSalarioBase(dto.getSalarioBase());
        return colaboradorRepository.save(colab);
    }
    public void delete(long id) {
        colaboradorRepository.deleteById(id);
    }
    public Colaborador update(Long id, ColaboradorDTO dto) {
        Colaborador colab = colaboradorRepository.findById(id).orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
        colab.setNome(dto.getNome());
        colab.setCargo(dto.getCargo());
        colab.setArea(dto.getArea());
        colab.setSalarioBase(dto.getSalarioBase());
        return colaboradorRepository.save(colab);
    }

    public List<Colaborador> show() {
        return colaboradorRepository.findAll();
    }
}
