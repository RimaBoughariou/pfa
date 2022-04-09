package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data


public class Transport_commun  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String type;
    private String capacité;
    private Date date_réservation;
    private String heure_réservation;



    public Transport_commun(String nom, String type, String capacité) {
        this.nom = nom;
        this.type = type;
        this.capacité = capacité;
    }

    public Transport_commun() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacité() {
        return capacité;
    }

    public void setCapacité(String capacité) {
        this.capacité = capacité;
    }

    public Transport_commun(long id, String nom, String type, String capacité, Date date_réservation, String heure_réservation) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.capacité = capacité;
        this.date_réservation = date_réservation;
        this.heure_réservation = heure_réservation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate_réservation() {
        return date_réservation;
    }

    public void setDate_réservation(Date date_réservation) {
        this.date_réservation = date_réservation;
    }

    public String getHeure_réservation() {
        return heure_réservation;
    }

    public void setHeure_réservation(String heure_réservation) {
        this.heure_réservation = heure_réservation;
    }
}
