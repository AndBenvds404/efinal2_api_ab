package com.example.efinal2_api_ab.security;

import java.security.SignatureException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class jwtUtils {

    /*
     * private static final Logger LOG = LoggerFactory.getLogger(jwtUtils.class);
     * 
     * @Value("$app.jwt.secret") // inyecta los valores desde el propetties
     * private String jwtSecreat; // semilla
     * 
     * public boolean validateJwtToken(String token) {
     * 
     * try {
     * Jwts.parser().setSigningKey(jwtSecreat).parseClaimsJws(token);
     * 
     * } catch (ExpiredJwtException e) {
     * // TODO: handle exception
     * LOG.error(e.getMessage());
     * } catch (SignatureException e) {
     * LOG.error(e.getMessage());
     * }
     * 
     * return false;
     * }
     * 
     * public String getUsernameFromJwtToken(String token) {
     * return
     * Jwts.parser().setSigningKey(jwtSecreat).parseClaimsJws(token).getBody().
     * getSubject();
     * }
     */

}
