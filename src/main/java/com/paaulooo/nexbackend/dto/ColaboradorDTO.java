package com.paaulooo.nexbackend.dto;

import com.paaulooo.nexbackend.Models.Cargo;
import lombok.Data;

@Data
public class ColaboradorDTO {
    private String nome;
    private String nomeSocial = "";
    private String cpf;
    private String email;
    private String telefone;
    private Cargo cargo;
}
