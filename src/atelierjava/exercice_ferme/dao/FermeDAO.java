/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Ferme;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class FermeDAO {

    private static ArrayList<Ferme> fermes = new ArrayList<>();

    public void ajouter(Ferme ferme) {
        fermes.add(ferme);
    }

    public Ferme recherche(String pseudo) {
        for (Ferme fermeAct : fermes) {
            if (pseudo.equals(fermeAct.getNom())) {
                return fermeAct;
            }
        }
        return null;
    }

    public boolean existe(String pseudo) {
        Ferme f = this.recherche(pseudo);
        if (f == null) {
            return false;
        }
        return true;
    }
}
