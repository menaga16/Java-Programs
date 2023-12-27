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
public class clubbed_words {
    
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of words: ");
        int n=scanner.nextInt();
        scanner.nextLine();

        String[] words=new String[n];
        System.out.println("Enter the words:");
        for (int i=0;i<n;i++) 
        {
            words[i]=scanner.nextLine();
        }

        System.out.println("Clubbed words:");
        for (int i=0;i<words.length;i++) 
        {
            for (int j=0;j<words.length;j++) 
            {
                if (i!=j&&(words[i]+words[j]).equals(words[j]+words[i])) 
                {
                    System.out.println(words[i]+words[j]);
                }
            }
        }

        scanner.close();
    
    }
    
}
