package fr.doranco.biblio;

import javax.swing.SwingUtilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.doranco.biblio.view.MainFrame;

@SpringBootApplication // @ veut dire ajouter informations suplementaires; Les bean sont des classes
						// suplementaires
public class BiblioApplication {

	public static void main(String[] args) {

		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(BiblioApplication.class, args);

		SwingUtilities.invokeLater(() -> {
			MainFrame mainFrame = new MainFrame();// creer la frame
			mainFrame.setVisible(true);// rendre visible
		});

	}

}
