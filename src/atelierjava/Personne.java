/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava;

/**
 *
 * @author Formation
 */
public class Personne {
    private String nom;
    private int age;

    private static int ageMin = -1;
    private static int ageMax = 0;
    

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        // Met à jour l'age minimal si ageMin == 0 ou age < ageMin
        if (ageMin == -1 || age < ageMin){
            ageMin = age;
        }
        // Met à jour l'age maximal si age > ageMax
        if (age > ageMax){
            ageMax = age;
        }
    }

    
    public static int getAgeMin() {
        return ageMin;
    }
    public static void setAgeMin(int ageMin) {
        Personne.ageMin = ageMin;
    }

    public static int getAgeMax() {
        return ageMax;
    }
    public static void setAgeMax(int ageMax) {
        Personne.ageMax = ageMax;
    }
    
}
