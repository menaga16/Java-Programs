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
public class pattern {
    
public static void main(String[] args) {
        String inputString;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string:");
        inputString=scanner.nextLine();
        int stringLength=inputString.length();
        int row=(stringLength+2)/3;
        int i=0;

        while(i<row) 
        {
            System.out.print(inputString.charAt(i));
            i++;
        }
        System.out.println();
        i = 1;
     
        while(i<row- 1) 
        {
            int spaces=row-i-1;
            int j=0;
            while(j<spaces) 
            {
                System.out.print(" ");
                j++;
            }
            System.out.println(inputString.charAt(row+i-1));
            i++;
        }

        i=0;
        while(i<row) 
        {
            System.out.print(inputString.charAt(2*row+i-2));
            i++;
        }
        System.out.println();
    }
}