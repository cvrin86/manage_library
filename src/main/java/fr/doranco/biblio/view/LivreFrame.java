package fr.doranco.biblio.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.doranco.biblio.service.LivreService;

@Component
public class LivreFrame extends JFrame {// creer une fenetre

    @Autowired
    private LivreService livreService;

    public void affiche() {

        setTitle("Gestion des livres");
        setSize(800, 600);
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);// panel est un conteneur et cardLayout veut dire comment organiser
                                                  // les panel, les cartes // les panels sont les elements dans la
                                                  // frame(fenetre)

        JPanel listeLivrePanel = new JPanel(new BorderLayout());
    }

}
