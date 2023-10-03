package com.example.esprituniv.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table( name = "Universite")

public class Universite implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="idUniversite")
    private Long idUniversite; //clé primaire
    private String nomUniversite;
    private String adresse;

    @OneToOne
    private Foyer foyer;

    public Long getIdUniversite() {
        return idUniversite;
    }

    public void setIdUniversite(Long idUniversite) {
        this.idUniversite = idUniversite;
    }

    public String getNomUniversite() {
        return nomUniversite;
    }

    public void setNomUniversite(String nomUniversite) {
        this.nomUniversite = nomUniversite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}