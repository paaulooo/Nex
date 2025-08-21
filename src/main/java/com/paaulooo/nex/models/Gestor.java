package com.paaulooo.nex.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Gestor extends Colaborador implements Remuneracao{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cargo;
    private String area;
    private double bolsa;
    private int horasExtras;

    public Gestor(long id, String nome, String cargo, String area, double salarioBase, int  horasExtras) {
        super(id ,nome, cargo, area, salarioBase, horasExtras);
    }

    @Override
    public double remunerar() {
        return 0;
    }
}
