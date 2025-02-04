package fr.doranco.biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.doranco.biblio.entity.Livre;

/**
 * Quand on dclare le type JpaRepository(ou Crud Repository) on doit preciser 2
 * type:
 * - le type de l entite pour laquelle on veut faire des requetes
 * - le tupe de la clé primare de cette entité
 * C ets pour faire des requetes dans la base de données
 * Quand on creer le backend on doit creer d abord le crud qui va etre utilisée
 * par l'admin
 * CrudRespoitory nous renvoie que le type
 */

@Repository
public interface LivreRepository extends JpaRepository<Livre, Integer> {// interface qui herite de CrudRepository ,
                                                                        // classes parametres, C'est elle, c est le
                                                                        // type, qui va
                                                                        // communiquer avec la base de donnée,Java va
                                                                        // cree un objet avec ces methodes

}
