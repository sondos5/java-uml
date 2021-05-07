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
public class ProductList {
    String listname;
    Product s1;
    void setListName(String listname){
        this.listname = listname;
    }
    String getListName(){
        return listname;
    }
  ProductList(Product s1){
       
  }  
  
}
 class Product{
     String product;
     
     void setProduct(String product){
         this.product = product;
     }
     String getProduct(){
         return product;
     }
     
 }
class OrderLine{
    Product item;
    int nounits;
       void setitem(Product item){
         this.item = item;
     }
     Product getitem(){
         return item;
     }
     void setnounits(int nounits){
         this.nounits = nounits;
     }
     int getnounits(){
         return nounits;
     } 
}