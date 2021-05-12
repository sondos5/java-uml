/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Sondos
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sondos
 */
public class MainClass {
    public static void main (String args[]) throws IOException{
        PyramidDAO pDAO;
        pDAO = new PyramidDAO();
        List <Pyramid> pyramids;
        pyramids = pDAO.readPyramid("C:\\Users\\Sondos\\Downloads\\archive\\pyramids.csv");
        int i=0;
        for(Pyramid p:pyramids){
            System.out.println("#"+(i++)+p);
            
        }
    }
    
}

    

