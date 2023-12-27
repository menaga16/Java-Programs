/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_training;

import java.util.*;

/**
 *
 * @author menaga
 */
public class permutation {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int n=scanner.nextInt();
        int[] array=new int[n];

        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++) 
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Permutations:");
        permute(array,n);
        scanner.close();
    }

    public static void permute(int[] array, int n) {
        int[] new_array = new int[n];

        for (int i=0;i<array.length;i++) 
        {
             System.out.print(array[i]+" ");
        }


        int i=0;
        while (i<n) 
        {
            if (new_array[i]<i) 
            {
                if (i%2==0) 
                {
                    swap(array,0,i);
                } 
                else 
                {
                    swap(array,new_array[i], i);
                }
                System.out.print("\n");
                for(int j=0;j<array.length;j++) 
                {
                    System.out.print(array[j]+" ");
                }   
               
                

                new_array[i]++;
                i=0;
            } 
            else 
            {
                new_array[i]=0;
                i++;
            }
        }
    }

    private static void swap(int[] arr,int i,int j) 
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
