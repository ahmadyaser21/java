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
public class Customer {
    private String firstName;//الاسم الاول 
    private String lastName;// اسم العائلة 
    private Account  account ;// object يمثل معلومات الحساب 
    

    public Customer(String f, String l) {
       firstName = f;
       lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
    
    public void setAccount(Account acc) {
      account = acc;
    }

   
    
   
}
