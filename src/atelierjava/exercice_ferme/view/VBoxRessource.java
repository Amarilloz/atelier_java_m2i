/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Formation
 */
public class VBoxRessource extends VBox{
    private Label lNbreRessources = new Label("0");
    private ImageView iImage = new ImageView("file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\AtelierJava\\imageFerme\\carotte.png");

    public VBoxRessource(long nbRessource, String urlImage) {
        this.iImage = new ImageView(urlImage);
        
        this.iImage.setFitWidth(200);
        this.iImage.setPreserveRatio(true);
        this.getChildren().add(this.iImage);
        this.getChildren().add(this.lNbreRessources);
    }
    
}
