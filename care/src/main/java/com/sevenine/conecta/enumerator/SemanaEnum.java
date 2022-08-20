package com.sevenine.conecta.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SemanaEnum {
    DOMINGO("1", "Domingo"),
    SEGUNDA("2", "Segunda-feira"),
    TERCA("3", "Terça-feira"),
    QUARTA("4", "Quarta-feira"),
    QUINTA("5", "Quinta-feira"),
    SEXTA("6", "Sexta-feira"),
    SABADO("7", "Sábado");

    private final String codigo;
    private final String descricao;
}
