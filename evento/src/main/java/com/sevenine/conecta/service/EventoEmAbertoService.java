package com.sevenine.conecta.services;

import com.sevenine.conecta.controllers.data.response.EventoResponse;

import java.util.List;

public interface EventoEmAbertoService {
    List<EventoResponse> consultar();
}
