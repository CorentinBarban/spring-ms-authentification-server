package com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.services;

import com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.entities.MembreEntity;
import com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembreMetierImpl implements MembreMetier{

    @Autowired
    MembreRepository membreRepository;


    /**
     * Obtenir un membre par son login
     *
     * @param login
     * @return Object MembreEntity
     */
    @Override
    public MembreEntity getMembreByName(String login) {
        return this.membreRepository.getMembreEntityByLogin(login);
    }
}
