/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class EcranJeuView extends GridPane{
    private VBoxRessource vbrCarotte = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\AtelierJava\\imageFerme\\carotte.png");
    private VBoxRessource vbrBle = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\AtelierJava\\imageFerme\\ble.png");
    private VBoxRessource vbrChevre = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\AtelierJava\\imageFerme\\chevre.png");
    private VBoxRessource vbrFromage = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\AtelierJava\\imageFerme\\fromage.png");
    private VBoxRessource vbrFermier = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\AtelierJava\\imageFerme\\fermier.png");

    public EcranJeuView() {
        this.add(vbrCarotte, 0, 0);
        this.add(vbrBle, 1, 0);
        this.add(vbrChevre, 2, 0);
        this.add(vbrFromage, 3, 0);
        this.add(vbrFermier, 4, 0);
    }
    
}
