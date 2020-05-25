package com.barban.corentin.m2.miage.miagesousleau.oauthauthorizationserver.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="membre")
public class MembreEntity {

    private String membreType;

    @Id
    private long idMembre;

    private String adresseMail;
    private Date dateCertificat;
    private Boolean enabled;
    private String etatAptitude;
    private String etatInscription;
    private String etatPaiement;
    private String login;
    private int niveauPlonge;
    private String nom;
    private String numLicence;
    private String password;
    private String paysResidence;
    private String prenom;
    private String villeResidence;
    private String role;

}
