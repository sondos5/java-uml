/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sondos
 */
public class Pyramid {

    private  String pharaoh;
    private  String modern_name;
    private  String site;
    private  double height;
    
    Pyramid(String pharaoh,String modern_name,String site ,double height){
        this.pharaoh = pharaoh;
        this.modern_name=modern_name;
        this.site= site;
        this.height=height;
        
    }
    public double getHeight(){
        return height;
    }
    void setHeight(double height){
        this.height = height;   
    }
    public String getModern_Name(){
        return modern_name;
    }
    void  setModern_Name(String modern_name){
        this.modern_name=modern_name;
    
    }
    public String getSite(){
        return site;
    } 
    void setSite (String site){
        this.site = site;
    } 
    public String getPharaoh(){
        return pharaoh;
    }
    void setPharaoh (String pharaoh){
        this.pharaoh = pharaoh;
    }
}    
