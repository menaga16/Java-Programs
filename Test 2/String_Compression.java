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
public class String_Compression {
 
    public static String compressed_string(String input){
       
        if (input==null||input.isEmpty()) 
        {
            return input;
        }

        String compressed="";
        int count=1;

        for (int i=0;i<input.length();i++){
            if (i+1<input.length()&&input.charAt(i)==input.charAt(i+1))
            {
                count++;
            } 
            else 
            {
                compressed+=input.charAt(i);
                if (count>1) 
                {
                    compressed+=count;
                }
                count = 1;
            }
        }

        return compressed;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input=scanner.nextLine();

        System.out.println("Compressed String: "+compressed_string(input));

        scanner.close();
    }
}
