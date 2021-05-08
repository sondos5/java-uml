/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sondos
 */
import java.util.*;

public class NewArray {
        String ipadd;
        int iplist;
        List<Integer> al = new ArrayList<>();
        
    
    NewArray(String ipaddress){
         ipadd = ipaddress;
    }
    
    List<Integer> listarray(){
        String [] parts= ipadd.split("\\.");
        for (int i=0;i==parts.length;i++){
            al.add (Integer.parseInt(parts[i]));     
        }
        return al;
        
    }
    
}
        


    
