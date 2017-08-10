
package com.jamr.medicalsysgui;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainMap {
    
    public static void main(String[] args) {
        
        Map<String,String> map=new TreeMap<>();

        map.put("CD","CARDIOLOGO");
        map.put("NE","NEUROLOGO");
        map.put("DE","DERMATOLOGO");
        map.put("UR","UROLOGO");
        map.put("GI","GINECOLOGO");
        map.put("OR","ORTOPEDA");
        map.put("OF","OFTARMOLOGO");
        
        
        Set<String> keys=map.keySet();
        List<String> values=new ArrayList<>(map.values());
        Set<Map.Entry<String,String>> entrySet=map.entrySet();

        System.out.println("Keys.: <"+keys+" >");
        System.out.println("Values:: <"+values+" >");
        System.out.println("EntrySet:: <"+ entrySet+" >");

        for(Map.Entry<String,String> entry : entrySet) {
            System.out.println(entry.getKey()+ " = "+ entry.getValue());
        }

        
    }
}
