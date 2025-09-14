package com.paaulooo.nexbackend.Models;

import lombok.Getter;

public enum Hierarquia {
    CEO(1, "CEO"),
    Gestor(2, "Gestor"),
    Coordenador(3, "Coordenador"),
    Supervisor(4, "Supervisor"),
    Analista(5, "Analista"),
    Assistente(6, "Assistente"),
    Estagiario(7, "Estagiário"),
    Auxiliar(8, "Auxiliar"),
    Operador(9, "Operacional"),
    Aprendiz(10, "Aprendiz");

    @Getter
    private final Integer nivel;
    private final String descricao;
    Hierarquia(Integer nivel, String descricao) {
        this.nivel = nivel;
        this.descricao = descricao;
    }

    public boolean isGestor() {
        return this.nivel <= Gestor.nivel;
    }
    public boolean isLider() {
        return this.nivel <= Coordenador.nivel;
    }
}
