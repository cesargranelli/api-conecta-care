package com.sevenine.conecta.converter.cadastro;

import com.sevenine.conecta.controllers.data.request.ContaRequest;
import com.sevenine.conecta.repository.data.Conta;

public interface CadastraAtualizaContaConverter {
    Conta toEntityData(ContaRequest request);
}
