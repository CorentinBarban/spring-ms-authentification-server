package com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.config;

import com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.entities.MembreEntity;
import com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.repository.MembreRepository;
import com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.services.MembreMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class CustomTokenEnhancer implements TokenEnhancer {

    @Autowired
    MembreMetier membreMetier;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        MembreEntity membre = this.membreMetier.getMembreByName(authentication.getName());
        final Map<String, Object> additionalInfo = new HashMap<>();
        additionalInfo.put("name", authentication.getName());
        additionalInfo.put("role", authentication.getAuthorities());
        additionalInfo.put("identifiant", membre.getIdMembre());

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInfo);
        return accessToken;
    }
}
