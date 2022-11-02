package com.international.shopfloor.auth;

import javax.servlet.http.HttpServletRequest;

public class AuthenticationService {

    public static String getTenant(HttpServletRequest req) {
        String token = req.getHeader("X-Tenant");
        return token;
    }
}
