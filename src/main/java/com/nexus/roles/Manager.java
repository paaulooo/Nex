package com.nexus.roles;

import com.nexus.Funcionario;

public class Manager extends Funcionario {
    private boolean isManager = true;
    private String user;
    private String password;

    public Manager(String nome, String cpf, String rg, double sal,
                   String endereco, String area, String cargo) {
        super(nome, cpf, rg, sal, endereco, area, cargo);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
