package com.paaulooo.nex.repositories;

import com.paaulooo.nex.models.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador,Long> {
    List<Colaborador> findByNome(String nome);
    List<Colaborador> findById(long id);

}
