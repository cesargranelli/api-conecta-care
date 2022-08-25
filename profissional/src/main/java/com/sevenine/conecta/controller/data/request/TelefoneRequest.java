package com.sevenine.conecta.controllers.data.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelefoneRequest {
    private String telefoneFixo;
    private String telefoneRecado;
    private String celularPrincipal;
    private String celularSecundario;
    private Long proprietarioId;
}
