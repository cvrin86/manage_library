package fr.doranco.biblio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.doranco.biblio.entity.Livre;
import fr.doranco.biblio.repository.LivreRepository;

@Service
public class LivreService {

    @Autowired
    private LivreRepository lr;

    public List<Livre> getAll() {
        return lr.findAll();
    }

    public Livre getById(Integer id) {
        return lr.findById(id).orElse(null);
    }

    /**
     * Cette methode 'save' sera utilisée par les requetes INSERT et UPDATE
     * Si l'objet Livre a un id qui est null, la requete sera INSERT
     * Sinon la requete sera UPDATE
     * 
     * @param livre
     * @return
     */

    public Livre save(Livre livre) {
        return lr.save(livre);
    }

    public boolean remove(Livre livre) {
        lr.delete(livre);
        return true;
    }

}
