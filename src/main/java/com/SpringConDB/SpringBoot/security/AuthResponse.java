
package com.SpringConDB.SpringBoot.security;


public class AuthResponse {
    private String email;
    private String accesToken;

    public AuthResponse() {
    }

    public AuthResponse(String email, String accesToken) {
        this.email = email;
        this.accesToken = accesToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccesToken() {
        return accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }
    
    
    
}
