package fr.doranco.biblio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.doranco.biblio.entity.Auteur;

@Repository
public interface AuteurRepository extends CrudRepository<Auteur, Integer> {

}
