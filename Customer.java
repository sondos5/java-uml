/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPK;

/**
 *
 * @author Sondos
 */
public class Customer {
    String name;
    String address;
    
    void setName(String name){
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
     void setAddress(String address){
        this.address = address;
        
    } 
       public String getAddress(){
        return address;
    }
       
}
