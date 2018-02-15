/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.test;

import java.util.HashMap;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class MapTest {
    
//    @Test
    public void MapPutGetOK() {
        HashMap<String,String> paysCapitales = new HashMap<>();
        
        paysCapitales.put("France","Paris");
        paysCapitales.put("Italie","Rome");
        paysCapitales.put("Allemagne","Berlin");
        
        System.out.println(paysCapitales.get("Allemagne"));
        
    }
    
    @Test
    public void MapKeySetOK() {
        HashMap<String,String> paysCapitales = new HashMap<>();
        
        paysCapitales.put("France","Paris");
        paysCapitales.put("Italie","Rome");
        paysCapitales.put("Allemagne","Berlin");

        Set<String> cles = paysCapitales.keySet();
        for (String pays : cles) {
            String capitale = paysCapitales.get(pays);
            System.out.println(pays+" : "+capitale);
        }
        
    }
    
}
