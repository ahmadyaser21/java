/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Ahmad Yaser 
 */
public class TestBanking {

    public static void main(String[] args) {

        Bank b = new Bank();//obgect من البنك 

        b.addCustomer("Jan", "Smith");
        b.getCustomer(0).setAccount(new Account(500));

        b.addCustomer("Owen", "Bryant");
        b.getCustomer(1).setAccount(new Account(500));

        b.addCustomer(" Tim", "Soley");
        b.getCustomer(2).setAccount(new Account(500));

        b.addCustomer(" Maria", "Soley");
        b.getCustomer(3).setAccount(b.getCustomer(2).getAccount());

        for (int i = 0; i <= 2; i++) {
            System.out.println("Retrieving the customer " + b.getCustomer(i).getFirstName()
                    + "" + b.getCustomer(i).getLastName() + "with his account");
            System.out.println("Withdraw 150.00 :" + b.getCustomer(i).getAccount().withdraw(150));
            System.out.println("Deposit 22.5 :" + b.getCustomer(i).getAccount().deposit(22.5));

            System.out.println("Withdraw 47.62:" + b.getCustomer(i).getAccount().withdraw(47.62));
            System.out.println("Withdraw 400.00:" + b.getCustomer(i).getAccount().withdraw(400));

            System.out.println("Customer [" + b.getCustomer(i).getLastName() + ","
                    + b.getCustomer(i).getFirstName() + "] has balance "
                    + b.getCustomer(i).getAccount().getBalance());
            System.out.println("");

        }
        System.out.println("Retrieving the customer" + b.getCustomer(3).getFirstName()
                + "" + b.getCustomer(3).getLastName() + "with her join account with husben Tim");
        System.out.println("Deposit 150.00 :" + b.getCustomer(3).getAccount().deposit(150));
        System.out.println("Withdraw 750.00 :" + b.getCustomer(3).getAccount().withdraw(750));

        System.out.println("Customer [" + b.getCustomer(3).getLastName() + ","
                + b.getCustomer(3).getFirstName() + "] has balance "
                + b.getCustomer(3).getAccount().getBalance());

    }

}
