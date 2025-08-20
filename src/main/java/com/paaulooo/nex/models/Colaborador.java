package com.paaulooo.nex.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Colaborador {
    private String nome;
    private String cargo;
    private String area;
    private double salarioBase;
    private int horasExtras;



}
