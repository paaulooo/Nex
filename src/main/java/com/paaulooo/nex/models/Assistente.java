package com.paaulooo.nex.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class Assistente extends Colaborador implements Remuneracao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cargo;
    private String area;
    private double salarioBase;
    private int horasExtras;

    public Assistente(long id,String nome, String cargo, String area, double salarioBase, int horasExtras) {
        super(id ,nome, cargo, area, salarioBase, horasExtras);
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
