/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class JoueurDAO {

    private static ArrayList<Joueur> joueurs = new ArrayList<>();

    public void ajouter(Joueur ferme) {
        joueurs.add(ferme);
    }

    public Joueur recherche(String pseudo) {
        for (Joueur JoueurAct : joueurs) {
            if (pseudo.equals(JoueurAct.getPseudo())) {
                return JoueurAct;
            }
        }
        return null;
    }

    public boolean existe(String pseudo) {
        Joueur f = this.recherche(pseudo);
        if (f == null) {
            return false;
        }
        return true;
    }

    public boolean existe(String pseudo, String mdp) {
        for (Joueur JoueurAct : joueurs) {
            if (JoueurAct.getPseudo().equals(pseudo)
                    && JoueurAct.getMotDePasse().equals(mdp)) {
                return true;
            }
        }
        return false;
    }
}
