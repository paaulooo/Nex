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

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100, unique = true)
    private String nome;
    @Column(name = "descricao", length = 255)
    private String descricao;
    @Column(name = "hierarquia", nullable = false)
    private Hierarquia hierarquia;

    //Auto Relacionamento com hierarquia
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "superior_id")
    private Cargo superior;

    @OneToMany(mappedBy = "superior", cascade = CascadeType.ALL)
    private Set<Cargo> subordinados = new HashSet<>();

    //Salario Base Cargo
    @Column(name = "salario_base_min", precision = 10, scale = 2)
    private BigDecimal salarioBaseMin;
    @Column(name = "salario_base_max", precision = 10, scale = 2)
    private BigDecimal salarioBaseMax;

    //Permissoes associadas ao cargo
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "cargo_permissoes", joinColumns = @JoinColumn(name = "cargo_id"))
    @Enumerated(EnumType.STRING)
    private Set<Permissao> permissoes = new HashSet<>();

    @Column(name = "admin")
    private boolean isAdmin = false;

}
