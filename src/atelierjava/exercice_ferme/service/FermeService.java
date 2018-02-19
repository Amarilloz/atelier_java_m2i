/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.service;

/**
 *
 * @author Formation
 */
public class FermeService {
    
    /**
     * Pseudo :<br>
     * - mini 3 lettres, maxi 8<br>
     * - unique<br>
     * Mdp :<br>
     * - mini 5 lettres, maxi 10<br>
     * - au moins une Maj et un chiffre<br>
     * @param pseudo
     * @param mdp 
     */
    public void inscription(String pseudo, String mdp){
        if(pseudo.length()<3 || pseudo.length()>8){
            throw new RuntimeException("Le pseudo doit être compris entre 3 et 8 caractères");
        }
        if(mdp.length()<5 || mdp.length()>8){
            throw new RuntimeException("Le mot de passe doit être compris entre 5 et 8 caractères");
        }
        
    }
}
