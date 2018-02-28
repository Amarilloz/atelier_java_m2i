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
public class ConnexionView extends GridPane {

    private Label lPseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMdp = new Label("Mot de passe");
    private PasswordField pMdp = new PasswordField();
    private Button bConnexion = new Button("Connexion");

    public ConnexionView(BorderPane borderPane) {
        this.add(lPseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pMdp, 1, 1);
        this.add(bConnexion, 1, 2);

        bConnexion.setOnAction(e -> {
            try {
                String pseudoEntree = tfPseudo.getText();
                String mdpEntree = pMdp.getText();
                JoueurService service = new JoueurService();
                service.connexion(pseudoEntree, mdpEntree);

                borderPane.setCenter(new Label("Bienvenue "
                        + pseudoEntree
                        + " !"));
            } catch (Exception exception) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erreur");
                alert.setHeaderText("Il s'est produit une erreur");
                alert.setContentText("Pseudo ou mot de passe incorrect");
                alert.showAndWait();
            }
        });
    }

}
