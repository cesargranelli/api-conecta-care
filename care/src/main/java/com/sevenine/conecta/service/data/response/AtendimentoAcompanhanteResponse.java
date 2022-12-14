package com.sevenine.conecta.services.data.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AtendimentoAcompanhanteResponse {
    private Long id;
    private String nomeCompleto;
    private String cpf;
    private ContatoResponse contato;
}
