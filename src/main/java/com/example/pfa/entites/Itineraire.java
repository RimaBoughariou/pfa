package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data


public class Itineraire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String libelle;
    private String caractéristiques;
    @OneToMany(mappedBy = "itineraire")
    private List<AgentDeVoyage> agentdevoyage;

    public Itineraire(long id, String libelle, String caractéristiques) {
        this.id = id;
        this.libelle = libelle;
        this.caractéristiques = caractéristiques;
    }
    public Itineraire() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCaractéristiques() {
        return caractéristiques;
    }

    public void setCaractéristiques(String caractéristiques) {
        this.caractéristiques = caractéristiques;
    }
}
