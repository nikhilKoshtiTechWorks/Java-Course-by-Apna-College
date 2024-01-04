// package bank;
// package Object_Oriented_Programming_systems;

import bank.*;

public class encapsulation{
    public static void main(String[] args) {
    
        bank.Bank account1 = new Bank();
        account1.name = "nikhil koshti";
        // Using the setter-getter function
        String bank_name = account1.accessToBank("Kotak");
        System.out.println(bank_name);
        
    }
}
