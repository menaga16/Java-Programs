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
public class array{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] input_array=new int[n];
        int[] even_array=new int[n];
        int[] odd_array=new int[n];

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter the elements of the array:");
        for (int i=0;i<n;i++) 
        {
            input_array[i]=scanner.nextInt();

            if(input_array[i]%2==0) 
            {
                even_array[evenCount++]=input_array[i];
            } 
            else 
            {
                odd_array[oddCount++]=input_array[i];
            }
        }
        even_array=Arrays.copyOf(even_array, evenCount);
        odd_array=Arrays.copyOf(odd_array, oddCount);

        System.out.println("Even elements: " +Arrays.toString(even_array));
        System.out.println("Odd elements: " +Arrays.toString(odd_array));

        scanner.close();
    }
    
}
