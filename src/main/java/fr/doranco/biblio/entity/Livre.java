package fr.doranco.biblio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // la table va etre cree dans la base de donnée
@Data // fournit sussi tous les constructeurs
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // la clé primare va etre incrementée
    private Integer id;

    @Column(nullable = false, length = 50)
    private String titre;

    @Column(columnDefinition = "TEXT")
    private String synopsis;

    @Column(length = 100)
    private String couverture;

}
