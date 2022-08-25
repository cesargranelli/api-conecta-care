package com.sevenine.conecta.controllers.data.response.tratamento;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ConsultaTratamentoSituacaoResponse {
    private String observacao;
    private LocalDateTime dataHora;
    private String status;
}
