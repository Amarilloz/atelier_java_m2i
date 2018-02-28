/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

import atelierjava.exercice_ferme.dao.JoueurDAO;
import atelierjava.exercice_ferme.dao.RessourceDAO;
import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.entite.Ressource;
import atelierjava.exercice_ferme.exception.PseudoExisteException;
import atelierjava.exercice_ferme.exception.ValidationException;

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
     * - mini 5 lettres, maxi 10<br>
     * - au moins une Maj et un chiffre<br>
     *
     * @param pseudo
     * @param mdp
     */
    public void ajouterRessource(long idJoueur,
            Ressource.TypeRessource typeRessource,
            long quantite) {
        // Génère les ressources SI aucune ressource pour ce joueur
        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.rechercher(idJoueur);
        // Ajouter ressource
        for (int i = 0; i < quantite; i++) {
            Ressource ressource = new Ressource();
            ressource.setDesignation(typeRessource);
            ressource.setJoueur(joueur);
            joueur.getRessourcesPossedees().add(ressource);
            RessourceDAO ressourceDAO = new RessourceDAO();
            ressourceDAO.ajouter(ressource);
        }
    }

    public void rejoindrePartie(long idJoueur) {
        // Génère les ressources SI aucune ressource pour ce joueur
        JoueurDAO dao = new JoueurDAO();
        Joueur joueur = dao.rechercher(idJoueur);
        if (joueur.getRessourcesPossedees().isEmpty()) {
            // Ajouter 5 carottes
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.CAROTTE, 5);
            // Ajouter 5 blés
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.BLE, 5);
            // Ajouter 5 chèvres
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.CHEVRE, 5);
            // Ajouter 2 fermiers
            this.ajouterRessource(idJoueur, Ressource.TypeRessource.FERMIER, 2);
        }
    }

    public void inscription(String pseudo, String mdp) throws ValidationException, PseudoExisteException {
        if (pseudo.length() < 3 || pseudo.length() > 8) {
            throw new ValidationException("Le pseudo doit être compris entre 3 et 8 caractères");
        }
        if (mdp.length() < 5 || mdp.length() > 10) {
            throw new ValidationException("Le mot de passe doit être compris entre 5 et 8 caractères");
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
            throw new ValidationException("Le mot de passe doit contenir au moins une majuscule et un chiffre");
        }

        // Vérifier que le pseudo est disponible
        JoueurDAO dao = new JoueurDAO();
        if (dao.existe(pseudo)) {
            throw new PseudoExisteException("Ce pseudo existe déjà");
        }

        // Ajoute la ferme en BDD
        Joueur joueur = new Joueur();
        joueur.setPseudo(pseudo);
        joueur.setMotDePasse(mdp);
        dao.ajouter(joueur);

    }

    public Joueur connexion(String pseudo, String mdp) {
        JoueurDAO dao = new JoueurDAO();
        Joueur j = dao.rechercher(pseudo, mdp);
        return j;
    }
}
