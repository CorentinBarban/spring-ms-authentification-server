package com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.repository;

import com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.entities.MembreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;


@Component
public interface MembreRepository extends CrudRepository<MembreEntity,Long> {

    MembreEntity getMembreEntityByLogin(String login);
}
