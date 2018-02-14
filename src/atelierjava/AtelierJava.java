/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

import java.util.ArrayList;

/**
 *
 * @author Formation
 */
public class AtelierJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> liste = new ArrayList();
        
        liste.add("Rouge");
        liste.add("Vert");
        liste.add("Jaune");
        // Affiche avec une boucle chaque élément de la liste
//        for(int i=0;i<liste.size();i++){
//            System.out.println(liste.get(i));
//        }
        for(String list : liste){
            System.out.println(list);
        }
    }
    
    public static void mainFerme(String[] args) {
        // TODO code application logic here
        Fermier f1 = new Fermier();
        f1.setNom("McGregor");
        f1.setPrenom("Kennet");
        f1.setSpecialite("Volaille");
        
        Fermier f2 = new Fermier();
        f2.setNom("Fritch");
        f2.setPrenom("Hans");
        f2.setSpecialite("Bovin");
        
        // 2. Affiche caract 2 fermier
        System.out.println(f1);
        System.out.println(f2);
        
    }
    
    public static void mainAnimaux(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal();
        a1.poidsEnKg = 240;
        a1.espece = "Cochon";
        a1.genre = "Sus";
        Animal a2 = new Animal();
        a2.poidsEnKg = 1000;
        a2.espece = "Girafe";
        a2.genre ="Giraffa";
        // 2. Affiche caract 2 animaux
        System.out.println(a1);
        System.out.println(a2);
        a1.afficher();
        a2.afficher();
        
        System.out.println(a1.espece+" : "+a1.poidsEnKg+"Kg");
        System.out.println(a2.espece+" : "+a2.poidsEnKg+"Kg");
        System.out.println("Total : "+Animal.nbAnimaux);
    }
    
    public static void mainVarStatiques(String[] args){
        Personne p1 = new Personne();
        p1.setNom("Obama");
        p1.setAge(56);
        Personne p2 = new Personne();
        p2.setNom("Churchill");
        p2.setAge(0);
        Personne p3 = new Personne();
        p3.setNom("Julien");
        p3.setAge(42);
        
        System.out.println(p1.getNom()+" : "+p1.getAge()+" ans");
        System.out.println(p2.getNom()+" : "+p2.getAge()+" ans");
        System.out.println(p3.getNom()+" : "+p3.getAge()+" ans");
        System.out.println("Age minimal : "+Personne.getAgeMin());
        System.out.println("Age maximal : "+Personne.getAgeMax());
    }
}
