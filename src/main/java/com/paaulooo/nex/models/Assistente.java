package com.paaulooo.nex.models;

public class Assistente implements Colaborador,  Remuneracao {
    private String nome;
    private String cargo;
    private String area;
    private double salarioBase;
    private int horasExtras;

    @Override
    public String getNomeColaborador() {
        return nome;
    }

    @Override
    public String getCargoColaborador() {
        return String.format("%s de %s", cargo, area);
    }

    @Override
    public double remunerar() {
        double liquido;
        if(horasExtras > 0){
            liquido = (salarioBase / 220) *(1 + 0.5) * horasExtras;
        }else{
            liquido = salarioBase;
        }

        return liquido;
    }
}
