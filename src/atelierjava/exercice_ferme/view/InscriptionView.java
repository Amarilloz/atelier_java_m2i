/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.service.JoueurService;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class InscriptionView extends GridPane {

    private Label lPseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMdp = new Label("Mot de passe");
    private PasswordField pfMdp = new PasswordField();
    private Button bInscription = new Button("Inscription");

    public InscriptionView(BorderPane borderPaneDuParent) {
        this.add(lPseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pfMdp, 1, 1);
        this.add(bInscription, 1, 2);

        // Définir mon controlleur sur clic bouton
        bInscription.setOnAction(e -> {
            try {
                // Récupération du pseudo et du mot de passe
                String pseudoEntree = tfPseudo.getText();
                String mdpEntree = pfMdp.getText();
                // Appel du service inscription
                JoueurService service = new JoueurService();
                service.inscription(pseudoEntree, mdpEntree);
                // Remplace centre du parent par texte vide
                borderPaneDuParent.setCenter(new Label("Inscription réussie"));
            } catch (Exception exception) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erreur");
                alert.setHeaderText("Il s'est produit une erreur");
                alert.setContentText(exception.getMessage());
                alert.showAndWait();
            }
        });
    }

}
