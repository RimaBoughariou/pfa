package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class AgentDeVoyage  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
     private String nom_agence;
    // private double prix_agent;
    @OneToMany(mappedBy = "agentdevoyage")
    private List<Facture> facture;
    @ManyToOne
   private Itineraire itineraire;
  // @ManyToMany(mappedBy = "agentdevoyage1")
  // private List<Demande> demande1;
   //@ManyToMany(mappedBy = "agentdevoyage3")
    //private List<Guide_personnel> guide_personnel;
     public AgentDeVoyage() {

     }

     public String getNom_agence() {
          return nom_agence;
     }

     public void setNom_agence(String nom_agence) {
          this.nom_agence = nom_agence;
     }

    // public double getPrix_agent() {
         // return prix_agent;
    // }

    // public void setPrix_agent(double prix_agent) {
        // this.prix_agent = prix_agent;
     //}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public AgentDeVoyage(Long id, String nom_agence ) {

          this.id=id;
          this.nom_agence = nom_agence;
         // this.prix_agent=prix_agent;
     }

    public AgentDeVoyage(Long id, String nom, String prenom, String email, String telephone, String nom_agence) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.nom_agence = nom_agence;

    }
    //  public void Mettre_à_jour( String nom){
     //   setNom(nom);
          //traitement
     }


