/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referances;
import java.util.function.BiPredicate;

/**
 *
 * @author Sondos
 */
public class MainReference {
    
        public static String betterstring (String s1, String s2, BiPredicate<String , String > s){
            System.out.println("better string is  the longer :");
            if (s.test(s1,s2)){
                return s1;
            }else
                return s2;
            
        
    }
       
       public static void main (String args[]){
           String s1 = "abcdefghijklmnopkrst";
           String s2="abcd";
           
           String s =  MainReference.betterstring(s1, s2,((t,u)-> t.length()> u.length()));
           System.out.println(s);
           
       }
       
}
