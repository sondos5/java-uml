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
public class Consumer extends Customer {
    int totalOrders;
    int calculatTotalOrders(){
        return totalOrders;
    }
    
}
class Merchent extends Customer {
    //float totalTotalpurachse(){
       
   // }
  //  float calculatTotalpurachse(){
  //      return ;
        
 //   }
}

class Order{
    Customer orderedby;
    OrderHeader s1;
    OrderLine s2;
    void setOrderedBy(Customer orderedby){
        this.orderedby = orderedby;
        
        
    }
    Order(OrderHeader s1,OrderLine s2){
        this.s1 =s1;
        this.s2 = s2;
        
    }
    Customer getOrderedBy(){
        return orderedby;
    }
    
}
class OrderHeader{
    int orderDate;
    int getOrderDate(){
        return orderDate;
        
    }
    
}
    

