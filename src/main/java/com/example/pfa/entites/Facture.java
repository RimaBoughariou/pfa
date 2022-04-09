package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data


public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String Désignation;
    private String Quantite;
    private double Prix_unitaire;
    private double Prix_total;
    private Date date_création;
    //private int nbre_group;

    @ManyToOne
   private AgentDeVoyage agentdevoyage;

    public Facture(long id, String désignation, String quantite, double prix_unitaire, double prix_total, Date date_création ) {
        this.id = id;
        Désignation = désignation;
        Quantite = quantite;
        Prix_unitaire = prix_unitaire;
        Prix_total = prix_total;
        this.date_création = date_création;
        //this.nbre_group=nbre_group;

    }

    public Facture() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDésignation() {
        return Désignation;
    }

    public void setDésignation(String désignation) {
        Désignation = désignation;
    }

    public String getQuantite() {
        return Quantite;
    }

    public void setQuantite(String quantite) {
        Quantite = quantite;
    }

    public double getPrix_unitaire() {
        return Prix_unitaire;
    }

    public void setPrix_unitaire(double prix_unitaire) {
        Prix_unitaire = prix_unitaire;
    }

    public double getPrix_total() {
        return Prix_total;
    }

    public void setPrix_total(double prix_total) {
        Prix_total = prix_total;
    }

    public Date getDate_création() {
        return date_création;
    }

    public void setDate_création(Date date_création) {
        this.date_création = date_création;
    }

    //public int getNbre_group() {
      //  return nbre_group;
   // }

   // public void setNbre_group(int nbre_group) {
       // this.nbre_group = nbre_group;
   // }
   // public double Prix_Group(double prix_unitaire) {

      //  Prix_total = prix_unitaire * nbre_group;
      //  return prix_unitaire;
   // }
    //public double Prix_Unitaire(Vol v,Hotel h,Guide_personnel g,AgentDeVoyage a) {
      // Prix_unitaire = v.getPrix_v() + h.getPrix_h()+ g.getPrix_guide()+ a.getPrix_agent();
       //return Prix_unitaire;
    //}
}
