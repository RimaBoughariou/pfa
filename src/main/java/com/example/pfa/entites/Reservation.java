package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data


public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date_réservation;
    private String heure_réservation;

   @ManyToOne
   private Demande demande;

    public Reservation(long id, Date date_réservation, String heure_réservation) {
        this.id = id;
        this.date_réservation = date_réservation;
        this.heure_réservation = heure_réservation;
    }

    public Reservation() {

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
