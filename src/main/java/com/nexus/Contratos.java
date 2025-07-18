package com.nexus;

public class Contratos {
    private int idContrato;
    private Funcionario funcionario;
    private String salario;
    private String cargo;
    private String setor;

    public Contratos(int idContrato, Funcionario funcionario, String salario, String cargo, String setor) {
        this.idContrato = idContrato;
        this.funcionario = funcionario;
        this.salario = salario;
        this.cargo = cargo;
        this.setor = setor;

    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
