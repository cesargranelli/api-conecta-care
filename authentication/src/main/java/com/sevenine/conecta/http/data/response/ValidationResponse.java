package com.sevenine.conecta.controllers.data.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ValidationResponse {
    private long id;
    private String email;
    private String role;
}
