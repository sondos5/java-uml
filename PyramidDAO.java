	/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sondos
 */
public class PyramidDAO implements pyramid_read{
    PyramidDAO(){
        
    }
    public List<Pyramid> readPyramid(String filename) throws FileNotFoundException, IOException{
        List<Pyramid> Pyramids; 
        Pyramids = new ArrayList<>();
        String[] fields= new String[0];
        BufferedReader br;
        br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        if (line!=null){
            System.out.println( line);
        }
        do{
            line = br.readLine();
            if (line!=null){
                fields = line.split(",");
                if (fields[7].equals("")) {
                    fields[7]="0.0";
                    Pyramid pr = new Pyramid(fields[0],fields[2],fields[4],Double.parseDouble(fields[7]));
                    Pyramids.add(pr);
                    System.out.println( Pyramids);
                    
                }
                } else {
                            // System.out.println( part);          
            }
        }while (line !=null);
        br.close();
        return Pyramids;
    }
        
    
}

