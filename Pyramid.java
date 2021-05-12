package file;

/**
 *
 * @author Sondos
 */
public class Pyramid {

    static void add(Pyramid pr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String pharaoh;
    String modern_name;
    String site;
    double height;
    
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
public static String valueOf(double height){
    String s=String.valueOf(height);
    return s;
}
    
}

