package com.example.pfa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data

public class Demande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String periode;

    @OneToMany(mappedBy = "demande")
    private List<Reservation> reservation;

    @ManyToOne
    private Pelerin pelerin;
    //@ManyToMany(mappedBy = "demande1")
  //private List<AgentDeVoyage> agentdevoyage1;

    public Demande(Long id, String periode) {
        this.id = id;
        this.periode = periode;
    }
    public Demande() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }
   // public void Afficher_groupe(String periode ){

      //  System.out.println();
   // }
}
