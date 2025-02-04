package fr.doranco.biblio.view.panel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LivreListPanel extends JPanel {
    public LivreListPanel() {
        this.setLayout(new BorderLayout());// definis une liste

        DefaultTableModel tableModel = new DefaultTableModel(new String[] { "ID", "Titre" }, 0); // gerer les donnes
                                                                                                 // dans la table

        JTable table = new JTable(tableModel);// table pour afficher les elements
        JScrollPane scrollPane = new JScrollPane(table);// ajouuter une barre de definlement
        this.add(scrollPane, BorderLayout.CENTER);// ajouter

        JPanel menuPanel = new JPanel();// creer un nouvel panel
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.LINE_AXIS)); // layaout avec des lignes
        this.add(menuPanel, BorderLayout.NORTH);// ajouter le panel en haut

        JButton btnAdd = new JButton("ajoute");
        JButton btnEdit = new JButton("edit");
        JButton btnDelete = new JButton("delete");
        JButton btnHome = new JButton("home");

        menuPanel.add(btnAdd);
        menuPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        menuPanel.add(btnEdit);
        menuPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        menuPanel.add(btnDelete);
        menuPanel.add(Box.createRigidArea(new Dimension(10, 0)));// ajouter de l'espace vide entre les elements
        menuPanel.add(btnHome);

    }

}
