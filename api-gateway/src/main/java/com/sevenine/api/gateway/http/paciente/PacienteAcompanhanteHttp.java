package com.sevenine.api.gateway.http.paciente;

import com.sevenine.api.gateway.config.properties.EndpointsProperties;
import com.sevenine.api.gateway.service.AbstractService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/paciente/acompanhantes")
public class PacienteAcompanhanteHttp {

    private final EndpointsProperties endpointsProperties;
    private final AbstractService abstractService;

    @PostMapping
    public ResponseEntity<?> adiciona(HttpServletRequest request) {
        return abstractService.abstractRequest(request, this.endpointsProperties.getPaciente(), HttpMethod.POST);
    }

    @GetMapping
    public ResponseEntity<?> acompanhantes(HttpServletRequest request) {
        return abstractService.abstractRequest(request, this.endpointsProperties.getPaciente(), HttpMethod.GET);
    }

    @GetMapping("{acompanhanteId}")
    public ResponseEntity<?> acompanhante(HttpServletRequest request) {
        return abstractService.abstractRequest(request, this.endpointsProperties.getPaciente(), HttpMethod.GET);
    }

}
