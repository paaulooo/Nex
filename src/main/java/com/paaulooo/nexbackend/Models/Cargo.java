package com.paaulooo.nexbackend.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Getter
public enum Cargo {
    CEO ("Ceo", "20000.00"),
    ANALISTA_ADMINISTRATIVO ("Analista Administrativo", "4000.00"),
    DESENVOLVEDOR ("Desenvolvedor", "4000.00"),
    ANALISTA_DE_SISTEMAS ("Analista de Sistemas", "9000.00"),
    GERENTE_DE_PROJETOS ("Gerente de Projetos", "12000.00"),
    ANALISTA_DE_QUALIDADE ("Analista de Qualidade", "5000.00"),
    GESTOR_RH("Gestor RH", "15000.00"),
    GESTOR_ADM ("Gestor ADM", "15000.00"),
    GESTOR_TI("Gestor TI", "15000.00"),
    GESTOR_TESTE("Gestor Teste","15000.00"),
    ENGENHEIRO_DE_SOFTWARE("Engenheiro de Software", "15000.00"),;

    final String cargo;
    final BigDecimal baseSalary;

    Cargo(String cargo, String salary){
        this.cargo = cargo;
        this.baseSalary = new BigDecimal(salary);
    }

}
