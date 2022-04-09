package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data

public class Bus  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String matriculle;
    //private double prix_b;
    private String nom;
    private String type;
    private String capacite;

    public Bus( String matriculle) {
        this.matriculle = matriculle;
        // this.prix_b=prix_b;
    }

    public Bus() {

    }

    public String getMatriculle() {
        return matriculle;
    }

    public void setMatriculle(String matriculle) {
        this.matriculle = matriculle;
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

}

   // public double getPrix_b() {
       // return prix_b;
   // }

    //public void setPrix_b(double prix_b) {
       // this.prix_b = prix_b;
   // }
