package com.sevenine.conecta.http.profissional;

import com.sevenine.conecta.config.properties.EndpointsProperties;
import com.sevenine.conecta.service.AbstractService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "complementos/profissional", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequiredArgsConstructor
public class ComplementoHttp {

    private final EndpointsProperties urlProperties;

    private final AbstractService abstractService;

    @PostMapping
    public ResponseEntity<?> sendComplementoProfissional(HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getProfissional(), HttpMethod.POST);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<?> getComplementoProfissional(@PathVariable Long id, HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getProfissional(), HttpMethod.GET);
    }

}