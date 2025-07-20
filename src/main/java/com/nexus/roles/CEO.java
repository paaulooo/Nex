package com.nexus.roles;

import com.nexus.Funcionario;

public class CEO extends Funcionario {
    private boolean isCEO = true;



    public CEO(String nome, String cpf, String rg, double sal, String endereco, String area, String cargo) {
        super(nome, cpf, rg, sal, endereco, area, cargo);
    }
}
