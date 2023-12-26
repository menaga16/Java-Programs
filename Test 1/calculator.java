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
public class calculator 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a= scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b= scanner.nextDouble();
        double result;

        System.out.println("choose any operator to preform any operations");
        System.out.println("Addition (+)");
        System.out.println("subtraction(-)");
        System.out.println("multiplication(*)");
        System.out.println("division(/)" );
        System.out.println("enter your choice: ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                result=a+b;
                System.out.println("Result: "+result);
                break;
            case '-':
                result=a-b;
                System.out.println("Result: " +result);
                break;
            case '*':
                result=a*b;
                System.out.println("Result: " +result);
                break;
            case '/':
                if (num2 != 0) {
                    result=a/b;
                    System.out.println("Result: " +result);
                } 
                else 
                {
                    System.out.println("Error: Division by zero is not possible!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator, enter the valid operator!");
                break;
        }

        scanner.close();
    }
}
