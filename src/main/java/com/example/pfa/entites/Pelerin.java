package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.List;

@Entity


public class Pelerin  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String nationalité;
    private String passport;


    @OneToMany(mappedBy = "pelerin")
    private List<Demande> demande;

   //@ManyToMany(mappedBy = "pelerin1")
   //private List<Guide_personnel> guide_personnel1;

    public Pelerin() {

    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
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

    public Pelerin(Long id, String nom, String prenom, String email, String telephone, String nationalité, String passport) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.nationalité = nationalité;
        this.passport = passport;
    }
    // public void Authentifier(String login, String mdp){
        //traitement
    //}
   // public void PayerFacture(Facture f,long id ){
       // if(f.getId()==id)
          //  f.getPrix_unitaire();
        //traitement
  //  }

    //public void Affiche_P(){
     //   System.out.println("    "+getPrenom()+"\t"+getNom()+"\t"+getEmail()+"\t"+getTelephone());
 //   }
}
