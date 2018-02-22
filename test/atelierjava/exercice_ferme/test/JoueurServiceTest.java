/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.test;

import atelierjava.exercice_ferme.service.JoueurService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class JoueurServiceTest {
    
    @Test
    public void inscriptionOK() {
        JoueurService service = new JoueurService();
        service.inscription("abcd", "aAaF123");
    }
    
    @Test(expected = RuntimeException.class)
    public void inscriptionKO() {
        JoueurService service = new JoueurService();
        service.inscription("abcd", "aaaa123");
    }
    
    @Test
    public void connexionOK(){
        JoueurService service = new JoueurService();
        service.inscription("azer", "Azerty01");
        service.inscription("azert", "Azerty02");
        service.connexion("azer", "Azerty01");
    }
    
    @Test(expected = RuntimeException.class)
    public void connexionKO(){
        JoueurService service = new JoueurService();
        service.inscription("azerty", "Azerty03");
        service.inscription("azertyu", "Azerty04");
        service.connexion("azerty", "Azerty04");
    }
}
