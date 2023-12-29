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
public class calculator {

    public int multiply(int x,int y) 
    {
        return x*y;
    }

    // Method overloading to multiply three doubles
    public double multiply(double x,double y,double z) 
    {
        return x*y*z;
    }

    public static void main(String[] args) 
    {
        calculator obj=new calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 integers:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int op1=obj.multiply(a,b);
        System.out.println("output: "+op1);

        System.out.println("Enter three doubles to multiply:");
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        double z=scanner.nextDouble();

        double op2=obj.multiply(x,y,z);
        System.out.println("output: " +op2);

        scanner.close();
    }
}