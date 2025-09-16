package com.paaulooo.nexbackend.Services;


import com.paaulooo.nexbackend.Models.Cargo;
import com.paaulooo.nexbackend.Repositories.CargoRepository;
import com.paaulooo.nexbackend.dto.CargoDTO;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CargoService {
    private final CargoRepository cargoRepository;

    public List<Cargo> findAllCargos(){
        return cargoRepository.findAll();
    }
    public Cargo saveCargo(CargoDTO dto){
        Cargo cargo = new Cargo();
        cargo.setNome(dto.getNome());
        cargo.setDescricao(dto.getDescricao());
        return cargoRepository.save(cargo);
    }
    public Cargo updateCargo(Long id, CargoDTO dto){
        Cargo cargo = cargoRepository.findById(id).orElseThrow(() -> new RuntimeException("Cargo não encontrado"));
        cargo.setNome(dto.getNome());
        cargo.setDescricao(dto.getDescricao());
        return cargoRepository.save(cargo);
    }


}
