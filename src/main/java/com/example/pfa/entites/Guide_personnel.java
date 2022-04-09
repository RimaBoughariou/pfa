package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class Guide_personnel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String domaine;
    private String periode_occupation;
    //private double prix_guide;
    //@ManyToMany(mappedBy = "guide_personnel")
   //private List<AgentDeVoyage> agentdevoyage3;
   //@ManyToMany(mappedBy = "guide_personnel1")
  //private List<Pelerin> pelerin1;

    public Guide_personnel() {

    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getPeriode_occupation() {
        return periode_occupation;
    }

    public void setPeriode_occupation(String periode_occupation) {
        this.periode_occupation = periode_occupation;
    }

    public Guide_personnel(Long id, String nom, String prenom, String email, String telephone, String domaine, String periode_occupation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.domaine = domaine;
        this.periode_occupation = periode_occupation;
    }

    public Guide_personnel(String domaine, String periode_occupation) {
        this.domaine = domaine;
        this.periode_occupation = periode_occupation;
       // this.prix_guide = prix_guide;
    }

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
    //  public double getPrix_guide() {
       // return prix_guide;
   // }

   // public void setPrix_guide(double prix_guide) {
        //this.prix_guide = prix_guide;
  //  }
}
