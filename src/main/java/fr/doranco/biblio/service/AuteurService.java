package fr.doranco.biblio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.doranco.biblio.entity.Auteur;
import fr.doranco.biblio.repository.AuteurRepository;

@Service
public class AuteurService {

    private AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;// injection de dependance
    }

    public List<Auteur> getAll() {

        Iterable<Auteur> list = auteurRepository.findAll();
        // List<Auteur> listAuteurs = new ArrayList<>();
        // for (Auteur auteur : list) {
        // listAuteurs.add(auteur);

        return (List<Auteur>) list;

    }
}
