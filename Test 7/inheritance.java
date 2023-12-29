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
public class inheritance {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Employee employee=new Employee();
        System.out.println("Enter Employee Details:");
        
        System.out.print("Name: ");
        employee.name=scanner.nextLine();
        
        System.out.print("Age: ");
        employee.age=Integer.parseInt(scanner.nextLine());
        
        System.out.print("Phone Number: ");
        employee.phoneNumber=scanner.nextLine();
        
        System.out.print("Address: ");
        employee.address=scanner.nextLine();
        
        System.out.print("Salary: ");
        employee.salary=Double.parseDouble(scanner.nextLine());
        
        System.out.print("Specialization: ");
        employee.specialization=scanner.nextLine();

        Manager manager=new Manager();
        System.out.println("\nEnter Manager Details:");
        
        System.out.print("Name: ");
        manager.name=scanner.nextLine();
        
        System.out.print("Age: ");
        manager.age=Integer.parseInt(scanner.nextLine());
        
        System.out.print("Phone Number: ");
        manager.phoneNumber=scanner.nextLine();
        
        System.out.print("Address: ");
        manager.address=scanner.nextLine();
        
        System.out.print("Salary: ");
        manager.salary=Double.parseDouble(scanner.nextLine());
        
        System.out.print("Department: ");
        manager.department=scanner.nextLine();

        scanner.close();

        System.out.println("\n---------------Employee Details----------------");
        System.out.println("Name: "+employee.name);
        System.out.println("Age: "+employee.age);
        System.out.println("Phone Number: "+employee.phone_umber);
        System.out.println("Address: "+employee.address);
        employee.printSalary();
        System.out.println("Specialization: "+employee.specialization);

        System.out.println("\n----------------Manager Details----------------");
        System.out.println("Name: " +manager.name);
        System.out.println("Age: " +manager.age);
        System.out.println("Phone Number: " +manager.phone_number);
        System.out.println("Address: " +manager.address);
        manager.printSalary();
        System.out.println("Department: " +manager.department);
    }
}
class Member 
{
    String name;
    int age;
    String phone_number;
    String address;
    double salary;

    public void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member 
{
    String specialization;
}

class Manager extends Member 
{
    String department;
}
