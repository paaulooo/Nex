package com.paaulooo.nex.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Admin implements Colaborador,Remuneracao{
    private String nome;
    private String cargo;
    private String area;
    private double salarioBase;
    private int horasExtras;
    private double bonus;
    private boolean clt = true;


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
            liquido = (salarioBase / 220) *(1 + 0.5) * horasExtras + bonus;
        }else{
            liquido = salarioBase + bonus;
        }

        return liquido;
    }
}
