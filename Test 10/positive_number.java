/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs_PT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class positive_number 
{
   private static final String FOLDER_PATH="C:\\Users\\menag\\Downloads\\MAR";

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String name=scanner.nextLine();
        String path=FOLDER_PATH +"\\"+name;

        try 
        {
            File file=new File(path);
            if (file.exists()) 
            {
                display(file);
                check_positive_numbers(file);
            } 
            else 
            {
                System.out.println("File not found.");
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Error: "+e.getMessage());
        } 
        finally 
        {
            scanner.close();
        }
    }

    public static void display(File file) throws FileNotFoundException 
    {
        Scanner fileScanner=new Scanner(file);
        System.out.println("Content of the file:");
        while (fileScanner.hasNext()) 
        {
            System.out.print(fileScanner.nextInt()+" ");
        }
        System.out.println();
        fileScanner.close();
    }

    public static void check_positive_numbers(File file) throws FileNotFoundException 
    {
        Scanner fileScanner=new Scanner(file);
        boolean positive=false;
        while (fileScanner.hasNext()) 
        {
            int num=fileScanner.nextInt();
            if (num>0) 
            {
                positive=true;
                System.out.println("Positive number found: "+num);
            }
        }
        if (!positive) 
        {
            System.out.println("No positive numbers found in the file.");
        }
        fileScanner.close();
    }
}



/*
 * 
OUTPUT 1:
Enter the file name: Sample.txt
Content of the file:
-1 -2 -3 4 
Positive number found: 4
BUILD SUCCESSFUL (total time: 10 seconds)
   
OUTPUT 2 :
Enter the file name: sample
File not found.
BUILD SUCCESSFUL (total time: 4 seconds)



 */