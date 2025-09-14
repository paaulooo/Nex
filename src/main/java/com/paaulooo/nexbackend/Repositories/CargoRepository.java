package com.paaulooo.nexbackend.Repositories;

import com.paaulooo.nexbackend.Models.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
    List<Cargo> findByNomeContainingIgnoreCase(String nome);
}
