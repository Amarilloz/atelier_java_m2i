/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class Ferme {
    
    private double budget;
    private String nom;
    private ArrayList<Ressource> ressourcesPossedees = new ArrayList<>();
    private ArrayList<Terrain> terrains = new ArrayList<>();

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Ressource> getRessourcesPossedees() {
        return ressourcesPossedees;
    }

    public void setRessourcesPossedees(ArrayList<Ressource> ressourcesPossedees) {
        this.ressourcesPossedees = ressourcesPossedees;
    }

    public ArrayList<Terrain> getTerrains() {
        return terrains;
    }

    public void setTerrains(ArrayList<Terrain> terrains) {
        this.terrains = terrains;
    }
    
}
