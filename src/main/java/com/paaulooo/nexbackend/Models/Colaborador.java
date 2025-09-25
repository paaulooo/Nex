package com.paaulooo.nexbackend.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "colaboradores")
public class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Valid
    private Long id;

//    //CARGO DO COLABORADOR
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "cargo_id, nullable = true")
//    private Cargo cargo = ;

    //DADOS PESSOAIS
    @Column(name = "nome", nullable = false, length = 180)
    @NotBlank(message = "O nome é obrigatório!")
    @Size(min = 2, max = 180, message = "O nome deve ter no máximo 180 caracteres!")
    private String nome;

    @Column(name = "nome_social", length = 180)
    @Size(max = 180, message = "O nome social deve ter no máximo 180 caracteres!")
    private String nomeSocial;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    @NotBlank(message = "O CPF é obrigatório!")
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 caracteres!")
    private String cpf;

    @Column(name = "email", nullable = false, length = 180, unique = true)
    @NotBlank(message = "O email é obrigatório!")
    @Size(min = 5, max = 180, message = "O email deve ter no máximo 180 caracteres!")
    private String email;

    @Column(name = "telefone", nullable = false, length = 15)
    @NotBlank(message = "O telefone é obrigatório!")
    @Size(min = 10, max = 15, message = "O telefone deve ter no máximo 15 caracteres!")
    private String telefone;

    @Column(name = "cargo", nullable = false, length = 30)
    @NotNull(message = "O Colaborador precisa ter um cargo!")
    @Enumerated(EnumType.STRING)
    private Cargo cargo;

}
