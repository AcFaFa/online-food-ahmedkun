package com.aff.Online.Food.response;

import com.aff.Online.Food.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private USER_ROLE role;
}