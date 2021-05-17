
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sondos
 */
public class Main {
    public static void main (String args[]) throws IOException{
        PyramidDAO pDAO;
        pDAO = new PyramidDAO();
        List <Pyramid> output;
        output = pDAO.readPyramid("C:\\Users\\Sondos\\Downloads\\archive\\pyramids.csv");
        output.sort(Comparator.comparingDouble(Pyramid::getHeight));
        int i=0;
        for (Iterator<Pyramid> it = output.iterator(); it.hasNext();) {
            Pyramid p = it.next();
            System.out.println("#"+(i++)+" "+"Modern_Name"+p.getModern_Name()+"Height"+p.getHeight()+"Site"+p.getSite()+"Pharaoh "+p.getPharaoh());
        }
        Map <String , Integer> pyramids = new HashMap<>();
        for (Pyramid p :output){
            String site=p.getSite();
            Integer count_sites = pyramids.get(site);
            if (count_sites !=null){
                 count_sites ++;
        }
            pyramids.put(site ,count_sites);
            
        
    }
    
        
    
    
}


    
    
}
