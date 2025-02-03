package fr.doranco.biblio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.doranco.biblio.entity.Auteur;

@Repository // interoge la base de donnes
public interface AuteurRepository extends CrudRepository<Auteur, Integer> { // pour ne pas ecrire des requetes// va
                                                                            // generer authomatqiquement les methodes
                                                                            // crud
    // un bean es une classe qui va etre instanciée par le framework(Spring)

    
}
