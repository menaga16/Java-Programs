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
public class natural_numbers {
public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N=scanner.nextInt();

        int mid=(N+1)/2;
        Thread t1=new Thread(new print(1,mid));
        Thread t2=new Thread(new print(mid+1,N));

        t1.start();
        t2.start();

        scanner.close();
    }
}

class print implements Runnable 
{
    private int start;
    private int end;

    public print(int start,int end) 
    {
        this.start=start;
        this.end=end;
    }

    public void run() 
    {
        for (int i=start;i<=end;i++) 
        {
            System.out.print(i+" ");
        }
    }
}