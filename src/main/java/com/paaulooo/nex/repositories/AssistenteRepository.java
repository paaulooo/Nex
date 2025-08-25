package com.paaulooo.nex.repositories;

import com.paaulooo.nex.models.Assistente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistenteRepository extends JpaRepository<Assistente,Long> {

}
