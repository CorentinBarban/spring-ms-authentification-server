package com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.services;

import com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.entities.MembreEntity;

public interface MembreMetier {

    /**
     * Obtenir un membre par son login
     * @param login
     * @return Object MembreEntity
     */
    MembreEntity getMembreByName(String login);
}
