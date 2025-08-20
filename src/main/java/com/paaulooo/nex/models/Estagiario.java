package com.paaulooo.nex.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Estagiario implements Colaborador, Remuneracao{
    private String nome;
    private String cargo;
    private String area;
    private double salario;


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
        return salario;
    }
}
