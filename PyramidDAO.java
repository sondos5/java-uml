/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sondos
 */
public class PyramidDAO {
    public PyramidDAO(){
        
    }
    public List<Pyramid> readPyramid(String cUsersSondosDownloadsarchivepyramidscsv) throws FileNotFoundException, IOException{
        List<Pyramid> list; 
        list = new ArrayList<>();
        //return list;
        BufferedReader br;
        br = new BufferedReader(new FileReader("C:\\Users\\Sondos\\Downloads\\archive\\pyramids.csv"));
        String line = br.readLine();
        if (line!=null){
            System.out.println( line);
        
    }
        do{
            line = br.readLine();
            if (line!=null){
                String[] fields = line.split(",");
                for (String part:fields){
                    System.out.println( part);
                    //Pyramid list = new Pyramid(part[0],part[1],part[2],Double.parseDouble([3]);
                    //Pyramid.add(pr);
                    
                }
            }
        }while (line !=null);
        br.close();
        return list;
        
        
    }

    
    
}
