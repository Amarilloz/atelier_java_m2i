/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.HashSet;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class IteratorTest {
    
    @Test
    public void IteratorOK() {
        HashSet<String> set = new HashSet<>();        
        
        set.add("rouge");
        set.add("jaune");
        set.add("vert");
        
        Iterator<String> iterateur = set.iterator();
                
        while (iterateur.hasNext()==true) {
            String next = iterateur.next();
            System.out.println(next);
        }
        
//        String s1 = iterateur.next();
//        String s2 = iterateur.next();
//        String s3 = iterateur.next();
//        if(iterateur.hasNext()==true){
//            iterateur.next();
//        }
//        
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

    }
    
}
