/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_training;


/**
 *
 * @author menaga
 */
import java.util.Scanner;

public class happy_number 
{

  public static void check_happy(int n) 
  {
        boolean happyfalse;
        for (int i=0;i<20;i++)
       { 
            n=digitSquareSum(n);

            if (n==1) 
            {
                happy=true;
                break;
            }
        }

        if (happy) 
        {
            System.out.println("happy number!!");
        } 
        else 
        {
            System.out.println("Not a happy number!!");
        }
    }

    public static int digitSquareSum(int n) 
    {
        int sum=0;
        while (n!=0) 
        {
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=scanner.nextInt();
        check_happy(number);
        scanner.close();
    }
}
