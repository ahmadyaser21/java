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
public class Account {
    private double balance;
    

    public Account(double initBalance) {
       balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amt){
        balance += amt;
        return true;
        
    }
    public boolean withdraw(double amt){
    if(amt>balance)
        return false;
    balance -= amt;
    return true;
   
        
    }
    
}
