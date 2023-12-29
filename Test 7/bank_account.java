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
public class bank_account {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean continueTransactions=true;
        Account account=null;

        while(continueTransactions) 
        {
            if(account==null) 
            {
                System.out.println("Select Account Type:");
                System.out.println("1. Savings Account");
                System.out.println("2. Checking Account");
                System.out.println("3. Loan Account");
                System.out.println("4. Exit");
                System.out.print("Enter choice (1/2/3/4): ");
                int choice = scanner.nextInt();

                switch(choice) 
                {
                    case 1:
                        System.out.print("------------------------------------------------\n");
                        account=new SavingsAccount();
                        System.out.print("------------------------------------------------\n");
                        break;
                    case 2:
                        System.out.print("------------------------------------------------\n");
                        account=new CheckingAccount();
                        System.out.print("------------------------------------------------\n");
                        break;
                    case 3:
                        System.out.print("------------------------------------------------\n");
                        account=new LoanAccount();
                        System.out.print("Enter loan amount: ");
                        double loanAmount=scanner.nextDouble();
                        ((LoanAccount)account).setLoanAmount(loanAmount);
                        System.out.print("------------------------------------------------\n");
                        break;
                    case 4:
                        System.out.print("------------------------------------------------\n");
                        continueTransactions=false;
                        System.out.print("------------------------------------------------\n");
                        break;
                    default:
                        System.out.print("------------------------------------------------\n");
                        System.out.println("Invalid choice.");
                        System.out.print("------------------------------------------------\n");
                        continue;
                }
            } 
            else 
            {
                System.out.println("Select Operation:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Change Account");
                System.out.println("5. Exit");
                System.out.print("Enter operation (1/2/3/4/5): ");
                int operation=scanner.nextInt();

                switch(operation)
                {
                    case 1:
                        System.out.print("------------------------------------------------\n");
                        System.out.print("Enter deposit amount: ");
                        double depositAmount=scanner.nextDouble();
                        account.deposit(depositAmount);
                        System.out.print("------------------------------------------------\n");
                        break;
                    case 2:
                        System.out.print("------------------------------------------------\n");
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount=scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                        System.out.print("------------------------------------------------\n");
                        break;
                    case 3:
                        System.out.print("------------------------------------------------\n");
                        System.out.println("Current balance: $" +account.checkBalance());
                        System.out.print("------------------------------------------------\n");
                        break;
                    case 4:
                        System.out.print("------------------------------------------------\n");
                        account = null;
                        System.out.print("------------------------------------------------\n");
                        break;
                    case 5:
                        continueTransactions = false;
                        System.out.print("------------------------------------------------\n");
                        break;
                    default:
                        System.out.print("------------------------------------------------\n");
                        System.out.println("Invalid operation.");
                        System.out.print("------------------------------------------------");
                        break;
                }
            }
        }

        scanner.close();
    }
}

interface Account 
{
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

abstract class BankAccount implements Account 
{
    private double balance;

    @Override
    public void deposit(double amount) 
    {
        if(amount>0) 
        {
            balance+=amount;
            System.out.println(amount+" deposited successfully.");
        } 
        else 
        {
            System.out.println("Invalid amount for deposit.");
        }
    }

    @Override
    public void withdraw(double amount) 
    {
        if(amount>0&&balance>=amount) 
        {
            balance-=amount;
            System.out.println(amount+" withdrawn successfully.");
        } 
        else 
        {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }

    @Override
    public double checkBalance() 
    {
        return balance;
    }
}

class SavingsAccount extends BankAccount 
{
    private double interestRate;

    public void setInterestRate(double interestRate)
    {
        this.interestRate=interestRate;
        System.out.println("Interest rate set to "+ interestRate+ "% for Savings Account.");
    }

    public void calculateInterest()
    {
        
        double interest=checkBalance()*(interestRate / 100);
        deposit(interest);
        System.out.println("Interest calculated and added: $" + interest);
    }
 }  

class CheckingAccount extends BankAccount
{
    private int freeTransactions;

    public void setFreeTransactions(int freeTransactions) 
    {
        this.freeTransactions=freeTransactions;
        System.out.println("Free transactions set to " +freeTransactions + " for Checking Account.");
    }

    public void processCheck(String recipient, double amount) 
    {
            if (amount>0&&freeTransactions>0) 
            {
            withdraw(amount);
            freeTransactions--;
            System.out.println(amount +" paid to "+recipient+" using a check.");
            } 
            else 
            {
            System.out.println("Invalid amount or no free transactions left.");
            }
    }
 
}


class LoanAccount implements Account 
{
    private double loanAmount;
    private double balance;

    @Override
    public void deposit(double amount) 
    {
        System.out.println("Cannot deposit into a loan account.");
    }

    @Override
    public void withdraw(double amount) 
    {
        if (amount>0) 
        {
            balance-=amount;
            System.out.println(amount + " paid towards the loan.");
        }
        else 
        {
            System.out.println("Invalid amount for payment.");
        }
    }

    @Override
    public double checkBalance() 
    {
        return balance;
    }

    public void setLoanAmount(double loanAmount) 
    {
        this.loanAmount=loanAmount;
        this.balance=loanAmount; 
    }
}