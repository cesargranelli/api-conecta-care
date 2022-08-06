package com.sevenine.api.gateway.http.homecare;

import com.sevenine.api.gateway.config.properties.EndpointsProperties;
import com.sevenine.api.gateway.service.AbstractService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(path = "homecares", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class HomeCareHttp {

    private final EndpointsProperties urlProperties;
    private final AbstractService abstractService;

    @GetMapping
    public ResponseEntity<?> findAll(HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getHomeCare(), HttpMethod.GET);
    }

    @PostMapping
    public ResponseEntity<?> cadastro(HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getHomeCare(), HttpMethod.POST);
    }

    @PutMapping
    public ResponseEntity<?> alteracao(HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getHomeCare(), HttpMethod.PUT);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> consulta(@PathVariable Long id, HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getHomeCare(), HttpMethod.GET);
    }

    @GetMapping("plantonistas/{plantonistaId}")
    public ResponseEntity<?> plantonista(HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getHomeCare(), HttpMethod.GET);
    }

    @GetMapping("plantonistas")
    public ResponseEntity<?> plantonistas(HttpServletRequest request) {
        return abstractService.abstractRequest(request, urlProperties.getHomeCare(), HttpMethod.GET);
    }

}
