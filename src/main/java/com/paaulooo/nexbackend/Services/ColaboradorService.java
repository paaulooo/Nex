package com.paaulooo.nexbackend.Services;


import com.paaulooo.nexbackend.Models.Colaborador;
import com.paaulooo.nexbackend.Repositories.ColaboradorRepository;
import com.paaulooo.nexbackend.dto.ColaboradorDTO;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ColaboradorService {
    private final ColaboradorRepository colaboradorRepository;

    private void setUserValues(Colaborador colaborador, ColaboradorDTO dto) {
        colaborador.setNome(dto.getNome());
        colaborador.setCpf(dto.getCpf());
        colaborador.setEmail(dto.getEmail());
        colaborador.setTelefone(dto.getTelefone());
        if(dto.getNomeSocial() != null){
            colaborador.setNomeSocial(dto.getNomeSocial());
        }
    }

    public Colaborador save(ColaboradorDTO dto){
        Colaborador colaborador = new Colaborador();
        setUserValues(colaborador, dto);
        return colaboradorRepository.save(colaborador);
    }
    public Colaborador update(Long id, ColaboradorDTO dto){
        Colaborador colaborador = colaboradorRepository.findById(id).orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
        setUserValues(colaborador, dto);
        return  colaboradorRepository.save(colaborador);
    }

    public void delete(Long id){
        Colaborador colaborador = colaboradorRepository.findById(id).orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
        colaboradorRepository.delete(colaborador);
    }

    public List<Colaborador> showAllColaboradores(){
        return colaboradorRepository.findAll();
    }
    public List<Colaborador> showColaboradorByID(Long id){
        return colaboradorRepository.findById(id).stream().toList();
    }
    public List<Colaborador> showColaboradorByName(String nome){
        return colaboradorRepository.findByNomeContainingIgnoreCase(nome);
    }

}
