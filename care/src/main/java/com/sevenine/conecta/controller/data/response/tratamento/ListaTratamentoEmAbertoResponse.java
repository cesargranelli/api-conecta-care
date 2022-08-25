package com.sevenine.conecta.controllers.data.response.tratamento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListaTratamentoEmAbertoResponse {
    private Long id;
    private String descricao;
    private Long pacienteId;
    private String nomePaciente;
}
