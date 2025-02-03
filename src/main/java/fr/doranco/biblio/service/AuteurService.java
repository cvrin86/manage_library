package fr.doranco.biblio.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.doranco.biblio.entity.Auteur;
import fr.doranco.biblio.repository.AuteurRepository;

@Service
public class AuteurService {

    private AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository) {// constructeur // la classe doit etre un bean pour pouvoir
                                                             // injecter des dependandes(auteurRepository)
        this.auteurRepository = auteurRepository;// injection de dependance
    }

    public List<Auteur> getAll() {

        Iterable<Auteur> list = auteurRepository.findAll();
        // List<Auteur> listAuteurs = new ArrayList<>();
        // for (Auteur auteur : list) {
        // listAuteurs.add(auteur);

        return (List<Auteur>) list;

    }

    // le check doivent etre faites sur toutes les methodes

    public Auteur getById(Integer id) {
        Optional<Auteur> auteur = auteurRepository.findById(id);// optional retourne soit un auteur soit nul
        return auteur.orElse(null);
    }

    public Auteur save(Auteur auteur) {

        if (auteur == null)
            return null;
        return auteurRepository.save(auteur);// save fait add et update
    }

    public boolean remove(Auteur auteur) {
        if (auteur == null || auteur.getId() == null || this.getById(auteur.getId()) == null) {// si l'auteur existe
                                                                                               // dans la bdd
            return false;
        }
        auteurRepository.delete(auteur);
        return true;
    }

    public boolean remove(int id) {
        if (this.getById(id) == null) {
            return false;
        }
        auteurRepository.deleteById(id);
        return true;
    }
}
