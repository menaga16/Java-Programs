/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs_PT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class comman_words {
    
 public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter directory path: ");
        String directoryPath=scanner.nextLine();

        Map<String, Integer> wordFrequency = new HashMap<>();

        File folder=new File(directoryPath);
        File[] files=folder.listFiles();

        if (files!=null){
            for (File file:files) 
            {
                try {
                    Scanner fileScanner=new Scanner(file);
                    while (fileScanner.hasNext()) 
                    {
                        String word=fileScanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
                        if (!word.isEmpty()) 
                        {
                            wordFrequency.put(word,wordFrequency.getOrDefault(word,0)+1);
                        }
                    }
                    fileScanner.close();
                } 
                catch (FileNotFoundException e) 
                {
                    System.out.println("File not found: " + e.getMessage());
                }
            }
        }

        int maxFrequency=java.util.Collections.max(wordFrequency.values());
        List<String> mostCommonWords = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : wordFrequency.entrySet()) 
        {
            if (entry.getValue()==maxFrequency) 
            {
                mostCommonWords.add(entry.getKey());
            }
        }

        System.out.println("Output:");
        for(String word:mostCommonWords) 
        {
            System.out.println("Word: " + word + ", Frequency: " + maxFrequency);
        }

        scanner.close();
    }
}


/*
 * 
OUTPUT:
Enter directory path: C:\Users\menag\Downloads\FOLDER
Output:
Word: java, Frequency: 2
Word: programming, Frequency: 2
BUILD SUCCESSFUL (total time: 5 seconds)



 */