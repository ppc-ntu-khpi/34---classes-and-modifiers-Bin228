/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Customer;

/**
 *
 * @author vipbi
 */
public class CustomerTest {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 1;
        Customer c = new Customer();
        c.displayCustomerInfo();
        
        System.out.println("***************\n");
        
        c.setID(42);
        c.setIsNew(false);
        c.setTotal((float)680.32);
        
        System.out.println("New info: "+c.getID()+" "+c.isIsNew()+" "+c.getTotal()+"\n");
    }
    
}
