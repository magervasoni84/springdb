package com.SpringConDB.SpringBoot.security.jwt;

import java.util.Date;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;


import com.SpringConDB.SpringBoot.model.User;
import io.jsonwebtoken.UnsupportedJwtException;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Component
/*@EnableWebSecurity(debug = true) */


public class JwtTokenUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class); 
    private static final long EXPIRE_DURATION = 1 * 60 * 60 * 1000; // 1 hs En millseg
    
    @Value("${app.jwt.secret}")
    private String secretKey;

    public String generateAccessToken(User user) {
        return Jwts.builder()
                .setSubject(String.format("%s,%s", user.getId(), user.getEmail())) //.setSubject(user.getId() + "," + user.getEmail())
                .setIssuer("CodeJava") //de donde saque el tutorial
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS512, secretKey) //asignar del algoritmo
                .compact();
    }

    public boolean validateAccessToken(String token) {
		try {
                    Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
                    return true;
		} catch (ExpiredJwtException ex) {
			LOGGER.error("JWT expired", ex.getMessage());
		} catch (IllegalArgumentException ex) {
			LOGGER.error("Token is null, empty or only whitespace", ex.getMessage());
		} catch (MalformedJwtException ex) {
			LOGGER.error("JWT is invalid", ex);
		} catch (UnsupportedJwtException ex) {
			LOGGER.error("JWT is not supported", ex);
		} catch (SignatureException ex) {
			LOGGER.error("Signature validation failed");
		}		
		return false;
	}

    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }

    private Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
    }
}
