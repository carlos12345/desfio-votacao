package br.com.dbserver.assembleia.domain.assembleia.entity;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AssembleiaStatus {
    ABERTA("Aberta"),
    ENCERRADA("Encerrada");

    private final String situacao;
    AssembleiaStatus(String valor) {
        this.situacao = valor;
    }
    @JsonValue
    public String getSituacao() {
        return situacao;
    }
}
