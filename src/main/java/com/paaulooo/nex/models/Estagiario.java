package com.paaulooo.nex.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data

public class Estagiario extends Colaborador implements MostraColaborador, Remuneracao{
    private String nome;
    private String cargo;
    private String area;
    private double salarioBase;
    private int horasExtras;

    public Estagiario(String nome, String cargo, String area, double salarioBase, int horasExtras) {
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
        return salarioBase;
    }
}
