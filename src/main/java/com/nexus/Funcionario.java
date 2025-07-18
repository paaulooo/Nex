package com.nexus;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    private String endereco;
    private String area;
    private String cargo;

    //Constructor
    public Funcionario(String nome, String cpf, String rg, double sal, String endereco, String area, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = sal;
        this.endereco = endereco;
        this.area = area;
        this.cargo = cargo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    //Metodos


}
