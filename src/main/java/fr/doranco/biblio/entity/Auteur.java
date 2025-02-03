package fr.doranco.biblio.entity;

import java.sql.Date;// Porquoi prendre data sql et pas java.util?

import jakarta.persistence.Column;
import jakarta.persistence.Entity; // version plus recente par rapport ajavax
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // la seule entite obligatoire
@Data
// @Table ce n est pas obligatoire, seulement si on veut que le nom de latable
// est differente de la class
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // integer ou long, pas de int car un id ne peux pasavoir la valeur 0// Tous
    // les chanps ont la valeur null par defaut

    @Column(length = 50)
    private String nom;
    @Column(length = 30)
    private String prenom;

    @Column(name = "biographie ", columnDefinition = "TEXT") // pas obligatoire
    private String bio;
    private Date dateNaissance;
    private Date dateDeces;
}
