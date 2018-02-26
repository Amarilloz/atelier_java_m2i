/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Formation
 */
public class NewFXMain extends Application {
    
    private Button bInscrription = new Button("Inscription");
    private Button bConnexion = new Button("Connexion");
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        HBox barreOutils = new HBox();
        barreOutils.getChildren().add(bInscrription);
        barreOutils.getChildren().add(bConnexion);
        
        bInscrription.setOnAction(e -> {
            root.setCenter(new InscriptionView(root));
        });
        
                
        root.setTop(barreOutils);
        root.setBottom(new Label("Copyright 2018 M2i"));
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Gaïa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
