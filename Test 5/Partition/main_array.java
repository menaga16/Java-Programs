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
public class main_array {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the elements: ");
        String input=scanner.nextLine();
        String[] elements=input.split(" ");
        int[] array=new int[elements.length];
        for (int i=0;i<elements.length;i++) 
        {
            array[i]=Integer.parseInt(elements[i]);
        }

        System.out.println("Enter the partition size: ");
        int partitionsize=scanner.nextInt();

        scanner.nextLine(); 
        System.out.println("Enter the partition order: ");
        input=scanner.nextLine();
        elements=input.split(" ");
        int[] order=new int[elements.length];
        for (int i=0;i<elements.length;i++) 
        {
            order[i]=Integer.parseInt(elements[i]);
        }

        partition merge=new partition(array,partitionsize);
        merge.partitionArray();
        merge.reorderPartitions(order);
        int[] mergedarray=merge.mergePartitions();

        System.out.println("Merged Array:");
        for (int num : mergedarray) 
        {
            System.out.print(num+" ");
        }

        scanner.close();
    }
}