/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;

/**
 *
 * @author Sondos
 */

public class stream {

    
     public static boolean Letter(String s1){
        
        if (s1 == null){
            System.out.println("string is null");
            return false;
         
        }else {
            boolean output = s1.chars().allMatch(Character::isLetter);
            System.out.println(output);
            return output;
            
        }
        
        
    }
    public static void main (String args[])throws IOException {
        String s= "sondosmohamed123457";
       // boolean output = s.chars().allMatch(s::isLetter);
        System.out.println(Letter(s));
        
    }

    
}
