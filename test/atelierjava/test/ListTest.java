/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class ListTest {
    
    // Méthode pour afficher les nombres factoriels jusqu'à 20!
    public int factorielle(int n){
        int res = n;
        for(int i=n-1;i>1;i--){
            res=res*i;
        }
        return res;
    }
    
    @Test
    public void factorielleOK(){
        ArrayList<Integer> factorielles = new ArrayList<>();
        // Affiche les nombres factoriels jusqu'à 20!
        for(int i=0;i<=20;i++){
            int res=factorielle(i);
            System.out.println(res);
        }
        
    }
    
//    @Test
    public void addAvecIndiceOK(){
        ArrayList<Integer> nombresPremiers = new ArrayList<>();
        
        nombresPremiers.add(2);
        nombresPremiers.add(5);
        nombresPremiers.add(1,3);
        
        
        // Méthode pour afficher les nombres premiers jusqu'à 100
        for(int i=2;i<100;i++){
            boolean premier = true;
            for(int j=2;j<i-1;j++){
                if(i%j==0){
                    premier=false;
                }
            }
            if(premier==true){
                System.out.println(i);// Affiche les nombres premiers jusqu'à 100
            }
        }
        System.out.println(nombresPremiers);// Affiche les nombres premiers jusqu'à 100
        
        // Méthode pour afficher les multiples de 2 jusqu'à 100
        for(int i=0;i<100;i=i+2){
            System.out.println(i);// Affiche les multiples de 2 jusqu'à 100
        }
        
        for(Integer nombre:nombresPremiers){
            System.out.println(nombre);
        }
    }
    
//    @Test
    public void addOK(){
        ArrayList<String> capitales = new ArrayList<>();
        
        capitales.add("Paris");
        capitales.add("Madrid");
        capitales.add("Rome");
        
        for(String capitale:capitales){
            System.out.println(capitale);
        }
    }
    
}
