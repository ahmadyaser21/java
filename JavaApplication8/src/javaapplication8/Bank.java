/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Ahmad Yaser Samour
 */
public class Bank {
    Customer[] arr ;
    private int numOfCustomers;

    public Bank() {
        arr = new Customer[10];// 10 اعطيت المصفوفة حجم 
        
    }
    public void addCustomer(String first,String last){
        arr[numOfCustomers] = new Customer(first, last);
        numOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numOfCustomers;
    }
    public Customer getCustomer(int i){
        return arr[i];
    }
    
}