/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs_PT;

import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class company {
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the following details of the Manager:");
        System.out.println("Name: ");
        String m_name=scanner.nextLine();
        System.out.println("ID:");
        int m_ID=scanner.nextInt();
        System.out.println("bonus percentage:");
        double m_bonus=scanner.nextDouble();
        scanner.nextLine(); 

        Manager manager=new Manager(m_name,m_ID,m_bonus);
        System.out.println("Enter the following details of the Developer:");
        System.out.println("Name:");
        String d_name=scanner.nextLine();
        System.out.println("ID:");
        int d_ID=scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("programming language:");
        String d_lang=scanner.nextLine();

        Developer developer = new Developer(d_name,d_ID,d_lang);

        scanner.close();

        
        System.out.println("---------------Manager Details--------------------");
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeID());
        System.out.println("Salary: $" + manager.calculateSalary());

        System.out.println("---------------Developer Details------------------");
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeID());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        System.out.println("Salary: $" + developer.calculateSalary());
    }
}


class Employee 
{
    private String name;
    private int employeeID;
    protected static final double basesalary=50000; 

    public Employee(String name,int employeeID) 
    {
        this.name=name;
        this.employeeID=employeeID;
    }

    public double calculateSalary() 
    {
        return basesalary;
    }

    public String getName() 
    {
        return name;
    }

    public int getEmployeeID() 
    {
        return employeeID;
    }
}

class Manager extends Employee 
{
    private double bonusPercentage;

    public Manager(String name,int employeeID,double bonusPercentage) 
    {
        super(name,employeeID);
        this.bonusPercentage=bonusPercentage;
    }

    @Override
    public double calculateSalary() 
    {
        double baseSalary=super.calculateSalary();
        return baseSalary+(baseSalary * bonusPercentage);
    }
}

class Developer extends Employee 
{
    private String programmingLanguage;
    private static final double allowance=10000;

    public Developer(String name, int employeeID, String programmingLanguage) 
    {
        super(name,employeeID);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    public double calculateSalary() 
    {
        double baseSalary=super.calculateSalary();
        return baseSalary+allowance;
    }

    public String getProgrammingLanguage() 
    {
        return programmingLanguage;
    }
}

