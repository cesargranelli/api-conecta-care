package com.sevenine.conecta.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("endpoints.homecare")
public class EndpointsHomeCareProperties {
    private String consultaPlantonista;
    private String consulta;
}
