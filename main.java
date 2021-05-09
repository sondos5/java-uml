
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sondos
 */
public class main {
    
    public static void main (String[] args) throws IOException{
    InputStreamReader  r = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader (r);
    System.out.println("enter data");
    String name = br.readLine();
    if (name.equals("stop")){
        System.out.println("enter data"+ name);
        br.close();
    }
    else {
        System.out.println("enter data"+ name);
        FileWriter writer = new FileWriter("C:\\Users\\Sondos\\Desktop\\newfile.txt",true);
        BufferedWriter buff = new BufferedWriter( writer);
        buff.write(name);
        buff.newLine();
        buff.close();
        
        
        
     
        
        
    
    
}
    
    
    
    
}

}