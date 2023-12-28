/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_training;

import java.util.Scanner;

/**
 *
 * @author menaga
 */
class account {
    
 private int accountId;
    private String name;
    private double balance;

    public account(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public boolean transferTo(account otherAccount, double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            otherAccount.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public void printReceipt() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Account Balance: Rs. " + balance + "\n");
    }
}

