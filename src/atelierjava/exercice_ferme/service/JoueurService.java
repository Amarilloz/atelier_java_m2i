/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.JoueurDAO;
import atelierjava.exercice_ferme.entite.Joueur;

/**
 *
 * @author Formation
 */
public class JoueurService {

    /**
     * Pseudo :<br>
     * - mini 3 lettres, maxi 8<br>
     * - unique<br>
     * Mdp :<br>
     * - mini 5 lettres, maxi 8<br>
     * - au moins une Maj et un chiffre<br>
     *
     * @param pseudo
     * @param mdp
     */
    public void inscription(String pseudo, String mdp) {
        if (pseudo.length() < 3 || pseudo.length() > 8) {
            throw new RuntimeException("Le pseudo doit être compris entre 3 et 8 caractères");
        }
        if (mdp.length() < 5 || mdp.length() > 8) {
            throw new RuntimeException("Le mot de passe doit être compris entre 5 et 8 caractères");
        }
        if (!mdp.matches(".*[A-Z].*") || !mdp.matches(".*[0-9].*")) {
            //"." : un seul caractère quelconque
            //".{5,8}" : entre 5 et 8 caratères
            //"[A-Z]" : un seul caractère [A-Z]
            //".*[A-Z].*" : au moins un caractère [A-Z]
            //"[A-Z].*" : commence par au moins un caractère [A-Z]
            //".*[A-Z]" : termine par au moins un caractère [A-Z]
            // . et [A-Z] sont des types. * et + et {5,8} sont des quantifieurs
            // * équivaut à {0,} et + équivaut à {1,}
            throw new RuntimeException("Le mot de passe doit contenir au moins une majuscule et un chiffre");
        }
        
        // Vérifier que le pseudo est disponible
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo)) {
            throw new RuntimeException("Ce pseudo existe déjà");
        }

        // Ajoute la ferme en BDD
        Joueur ferme = new Joueur();
        ferme.setPseudo(pseudo);
        ferme.setMotDePasse(mdp);
        dao.ajouter(ferme);

    }
    public boolean connexion(String pseudo,String mdp){
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo,mdp)) {
            return true;
        }
        return false;
    }
}
