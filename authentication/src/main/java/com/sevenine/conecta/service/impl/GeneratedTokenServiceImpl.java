package com.sevenine.conecta.services.impl;

import com.sevenine.conecta.configs.properties.SecurityProperties;
import com.sevenine.conecta.services.GeneratedTokenService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class GeneratedTokenServiceImpl implements GeneratedTokenService {

    private final SecurityProperties securityProperties;

    @Override
    public String retrieveToken(String username, List<String> roles, String module) {
        Date expirationDate = new Date(System.currentTimeMillis() + this.securityProperties.getExpirationTime());
        Key key = Keys.hmacShaKeyFor(this.securityProperties.getKey().getBytes());

        Map<String, Object> objectObjectLinkedHashMap = new LinkedHashMap<>();
        objectObjectLinkedHashMap.put("username", username);
        objectObjectLinkedHashMap.put("roles", roles);
        objectObjectLinkedHashMap.put("module", module);

        return Jwts.builder()
                .addClaims(objectObjectLinkedHashMap)
                .signWith(key, SignatureAlgorithm.HS256)
                .setExpiration(expirationDate)
                .compact();
    }
}
