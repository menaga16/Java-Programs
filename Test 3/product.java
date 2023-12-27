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
public class product {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array");
        int n=scanner.nextInt();
        int[] array=new int[n];

        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++) 
        {
            array[i]=scanner.nextInt();
        }

        int[] result=new int[n];

        for(int i=0;i<n;i++) 
        {
            int product=1;
            for (int j=0;j<n;j++) 
            {
                if (j!=i) 
                {
                    product*=array[j];
                }
            }
         
            result[i]=product;
        }

        System.out.println("Output array:");
       for (int i=0;i<result.length;i++) 
       {
               System.out.print(result[i]+" ");
       }


        scanner.close();
    }
}