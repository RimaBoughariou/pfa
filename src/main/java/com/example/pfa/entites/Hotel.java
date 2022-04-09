package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity

@Data


public class Hotel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String type;
    private String capacite;
    private String caracteristiques;
    private Date date_entree;
    private Date date_sortie;




    public Hotel(String caracteristiques, Date date_entree, Date date_sortie ) {
        this.caracteristiques = caracteristiques;
        this.date_entree = date_entree;
        this.date_sortie = date_sortie;
       // this.prix_h=prix_h;
    }

    public Hotel() {

    }

    public String getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(String caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public Date getDate_entree() {
        return date_entree;
    }

    public void setDate_entree(Date date_entree) {
        this.date_entree = date_entree;
    }

    public Date getDate_sortie() {
        return date_sortie;
    }

    public void setDate_sortie(Date date_sortie) {
        this.date_sortie = date_sortie;
    }

    public Hotel(long id, String nom, String type, String capacite, String caracteristiques, Date date_entree, Date date_sortie) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.capacite = capacite;
        this.caracteristiques = caracteristiques;
        this.date_entree = date_entree;
        this.date_sortie = date_sortie;
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
    //public double getPrix_h() {
     //   return prix_h;
    //}

  //  public void setPrix_h(double prix_h) {
       // this.prix_h = prix_h;
   // }
}
