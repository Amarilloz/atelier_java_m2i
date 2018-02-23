/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.dao;

import atelierjava.exercice_ferme.entite.Joueur;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Formation
 */
public class JoueurDAO {
    
    public Joueur rechercher(long idJoueur){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Joueur j = em.find(Joueur.class, idJoueur);
        return j;
    }

    public void ajouter(Joueur j) {
        // Récupère EntityManager
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(j);
        em.getTransaction().commit();
    }

    public Joueur recherche(String pseudo) {
        // Récupère EntityManager
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        // Vérifie
        Query query = em.createQuery(""
                + "SELECT   j "
                + "FROM     Joueur j "
                + "WHERE    j.pseudo=:pseudoRecherche");
        query.setParameter("pseudoRecherche", pseudo);
        Joueur j = (Joueur) query.getSingleResult();
        return j;
    }

    public boolean existe(String pseudo) {
        // Récupère EntityManager
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        // Vérifie
        Query query = em.createQuery(""
                + "SELECT   COUNT(j) "
                + "FROM     Joueur j "
                + "WHERE    j.pseudo=:pseudoExistant");
        query.setParameter("pseudoExistant", pseudo);
        Long nbRes = (Long) query.getSingleResult();
        if (nbRes == 0) {
            return false;
        }
        return true;
    }

    public Joueur rechercher(String pseudo, String mdp) {
        // Récupère EntityManager
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        // Vérifie
        Query query = em.createQuery(""
                + "SELECT   j "
                + "FROM     Joueur j "
                + "WHERE    j.pseudo=:pseudoExistant "
                + "AND      j.motDePasse=:mdpExistant");
        query.setParameter("pseudoExistant", pseudo);
        query.setParameter("mdpExistant", mdp);
        Joueur j = (Joueur) query.getSingleResult();
        return j;
    }
}
