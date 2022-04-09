package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data


public class Vol  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String type;
    private String capacite;
     private String numero;
     private Date date_depart;
     private String heure_depart;
     private Date date_arrivee;
     private String heure_arrivee;
    private String airport_depart;
    private String airport_arrivee;
    //private double prix_v;

    public Vol() {

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public String getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public String getHeure_arrivee() {
        return heure_arrivee;
    }

    public void setHeure_arrivee(String heure_arrivee) {
        this.heure_arrivee = heure_arrivee;
    }

    public String getAirport_depart() {
        return airport_depart;
    }

    public void setAirport_depart(String airport_depart) {
        this.airport_depart = airport_depart;
    }

    public String getAirport_arrivee() {
        return airport_arrivee;
    }

    public void setAirport_arrivee(String airport_arrivee) {
        this.airport_arrivee = airport_arrivee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }
    //public double getPrix_v() {
       // return prix_v;
    //}

   // public void setPrix_v(double prix_v) {
       // this.prix_v = prix_v;
   // }





    public Vol(String numero, Date date_depart, String heure_depart, Date date_arrivee, String heure_arrivee, String airport_depart, String airport_arrivee ) {
        this.numero = numero;
        this.date_depart = date_depart;
        this.heure_depart = heure_depart;
        this.date_arrivee = date_arrivee;
        this.heure_arrivee = heure_arrivee;
        this.airport_depart = airport_depart;
        this.airport_arrivee = airport_arrivee;
      //  this.prix_v=prix_v;
    }

    public Vol(long id, String nom, String type, String capacite, String numero, Date date_depart, String heure_depart, Date date_arriee, String heure_arrivee, String airport_depart, String airport_arrivee) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.capacite = capacite;
        this.numero = numero;
        this.date_depart = date_depart;
        this.heure_depart = heure_depart;
        this.date_arrivee = date_arrivee;
        this.heure_arrivee = heure_arrivee;
        this.airport_depart = airport_depart;
        this.airport_arrivee = airport_arrivee;
    }
}
