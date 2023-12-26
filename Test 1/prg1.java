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
public class prg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner scanner=new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a=scanner.nextInt();
        System.out.println("Entered integer: "+a);

        System.out.print("Enter a floating-point number: ");
        double b=scanner.nextDouble();

        System.out.print("Enter a floating-point number: ");
        double c=scanner.nextDouble();

        double average=(b+c)/2;
        System.out.printf("Average of %.2f and %.2f is: %.2f",b,c,average);

        scanner.close();
    }
}
