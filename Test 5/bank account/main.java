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
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Enter initial balance for Account A: ");
        double initialBalanceA = scanner.nextDouble();

        System.out.println("Enter initial balance for Account B: ");
        double initialBalanceB = scanner.nextDouble();

        account accountA = new account(12344, "Account A", initialBalanceA);
        account accountB = new account(56789, "Account B", initialBalanceB);

        System.out.println("Enter 'AB' to transfer from Account A to Account B, or 'BA' to transfer from Account B to Account A: ");
        String transferDirection = scanner.next().toUpperCase();

        if (transferDirection.equals("AB")) {
            System.out.println("Enter amount to transfer from Account A to Account B: ");
            double transferAmountAB = scanner.nextDouble();

            if (accountA.transferTo(accountB, transferAmountAB)) {
                System.out.println("Transfer Successful: Rs. " + transferAmountAB + " from Account A to Account B");
                accountA.printReceipt();
                accountB.printReceipt();
            } else {
                System.out.println("Insufficient funds in Account A for the transfer.");
            }
        } else if (transferDirection.equals("BA")) {
            System.out.println("Enter amount to transfer from Account B to Account A: ");
            double transferAmountBA = scanner.nextDouble();

            if (accountB.transferTo(accountA, transferAmountBA)) {
                System.out.println("Transfer Successful: Rs. " + transferAmountBA + " from Account B to Account A");
                accountA.printReceipt();
                accountB.printReceipt();
            } else {
                System.out.println("Insufficient funds in Account B for the transfer.");
            }
        } else {
            System.out.println("Invalid transfer direction.");
        }

        scanner.close();
    }
}