package fr.doranco.biblio.view;

import javax.swing.JFrame;//package avec des  elements graphique
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.springframework.beans.factory.annotation.Autowired;

import fr.doranco.biblio.entity.Auteur;
import fr.doranco.biblio.service.AuteurService;

import java.awt.BorderLayout;
import java.util.List;

public class MainFrame extends JFrame {
    @Autowired
    AuteurService auteurService;

    public MainFrame start() {

        this.setTitle("Gestion de la bibliotheque");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // .ExitOnClose c est une constante

        JPanel auteurPanel = new JPanel();
        auteurPanel.setLayout(new BorderLayout());
        String[] colonnes = { "ID", "prenpm", "nom", "date naissance", "date deces" };
        DefaultTableModel tableModel = new DefaultTableModel(colonnes, 0);
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        auteurPanel.add(scrollPane, BorderLayout.CENTER);
        List<Auteur> auteurs = this.auteurService.getAll();

        for (Auteur auteur : auteurs) {
            tableModel.addRow(new Object[] {
                    auteur.getId(),
                    auteur.getNom(),
                    auteur.getPrenom(),
                    auteur.getDateNaissance(),
                    auteur.getDateDeces()

            });
        }
        this.add(auteurPanel);
        this.setVisible(true);
        return this;

    }

}
