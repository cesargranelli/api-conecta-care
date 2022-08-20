package com.sevenine.conecta.service.converter;

import com.sevenine.conecta.controller.data.request.EnderecoRequest;
import com.sevenine.conecta.controller.data.response.EnderecoCadastroResponse;
import com.sevenine.conecta.controller.data.response.EnderecoResponse;
import com.sevenine.conecta.controller.data.response.EstadoResponse;
import com.sevenine.conecta.controller.data.response.PaisResponse;
import com.sevenine.conecta.repository.data.Endereco;
import com.sevenine.conecta.repository.data.Estado;
import com.sevenine.conecta.repository.data.Pais;
import org.springframework.stereotype.Component;

@Component
public class EnderecoServiceConverter {

    public Endereco toEntity(EnderecoRequest request) {
        return Endereco
                .builder()
                .estado(Estado
                        .builder()
                        .id(request.getEstado().getId())
                        .codigo(request.getEstado().getCodigo())
                        .uf(request.getEstado().getUf())
                        .nome(request.getEstado().getNome())
                        .regiao(request.getEstado().getRegiao())
                        .build())
                .pais(Pais
                        .builder()
                        .id(request.getPais().getId())
                        .codigo(request.getPais().getCodigo())
                        .nome(request.getPais().getNome())
                        .build())
                .idHomecare(request.getIdHomeCare())
                .logradouro(request.getLogradouro())
                .numero(request.getNumero())
                .complemento(request.getComplemento())
                .bairro(request.getBairro())
                .cidade(request.getCidade())
                .cep(request.getCep())
                .comprovante(request.getComprovante())
                .build();
    }

    public EnderecoResponse toResponse(Endereco entity) {
        return EnderecoResponse
                .builder()
                .id(entity.getId())
                .estado(EstadoResponse
                        .builder()
                        .id(entity.getEstado().getId())
                        .codigo(entity.getEstado().getCodigo())
                        .uf(entity.getEstado().getUf())
                        .nome(entity.getEstado().getNome())
                        .regiao(entity.getEstado().getRegiao())
                        .build())
                .pais(PaisResponse
                        .builder()
                        .id(entity.getPais().getId())
                        .codigo(entity.getPais().getCodigo())
                        .nome(entity.getPais().getNome())
                        .build())
                .logradouro(entity.getLogradouro())
                .numero(entity.getNumero())
                .complemento(entity.getComplemento())
                .bairro(entity.getBairro())
                .cidade(entity.getCidade())
                .cep(entity.getCep())
                .comprovante(entity.getComprovante())
                .idHomeCare(entity.getIdHomecare())
                .build();
    }

    public EnderecoCadastroResponse toResponse(Long id) {
        return EnderecoCadastroResponse.builder().id(id).build();
    }

}
