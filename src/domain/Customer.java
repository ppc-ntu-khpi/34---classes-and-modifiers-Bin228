/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author vipbi
 */
public class Customer {
    private int ID;
    private boolean isNew;
    private float total;

    public Customer(int ID, boolean isNew, float total) {
        this.ID = ID;
        this.isNew = isNew;
        this.total = total;
    }
        
    public Customer() {
        ID = 1;
        isNew = true;
        total = 1000;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public boolean isIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", isNew=" + isNew + ", total=" + total + '}';
    }
    
    public void displayCustomerInfo() {
        System.out.println("ID: "+ID+"\nisNew: "+isNew+"\ntotal: "+total+"\n");
    }
}
