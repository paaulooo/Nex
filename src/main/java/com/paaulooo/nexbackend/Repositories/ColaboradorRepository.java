package com.paaulooo.nexbackend.Repositories;

import co.elastic.clients.elasticsearch.license.LicenseStatus;
import com.paaulooo.nexbackend.Models.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

    List <Colaborador> findByNomeContainingIgnoreCase(String nome);


}
