package com.example.esprituniv.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "Reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="idReservation")
    private long idReservation;
    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    @ManyToMany (mappedBy = "reservations")
    private List<Etudiant> etudiants;

    public long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(long idReservation) {
        this.idReservation = idReservation;
    }

    public Date getAnneeUniversitaire() {
        return anneeUniversitaire;
    }

    public void setAnneeUniversitaire(Date anneeUniversitaire) {
        this.anneeUniversitaire = anneeUniversitaire;
    }


}
