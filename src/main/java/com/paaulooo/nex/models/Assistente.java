package com.paaulooo.nex.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Assistente extends Colaborador implements MostraColaborador,  Remuneracao {
    private String nome;
    private String cargo;
    private String area;
    private double salarioBase;
    private int horasExtras;

    public Assistente(String nome, String cargo, String area, double salarioBase, int horasExtras) {
        super(nome, cargo, area, salarioBase, horasExtras);
    }

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
