/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs_PT;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class get_file {

    private static final String FOLDER_PATH="C:\\Users\\menag\\Downloads\\MAR";

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the file extension: ");
        String extension=scanner.nextLine().toLowerCase();
        System.out.println("Files with extension "+extension+" in folder "+FOLDER_PATH+":");
        getFilesWithExtension(FOLDER_PATH,extension);
        scanner.close();
    }

    public static void getFilesWithExtension(String folderPath, String extension) 
    {
        File folder=new File(folderPath);
        File[] files=folder.listFiles();
        boolean filesFound=false;
        
        if (files!=null)
        {
            for (File file:files) 
            {
                if (file.isFile()&&file.getName().toLowerCase().endsWith(extension)) 
                {
                    System.out.println(file.getName());
                    filesFound=true;
                }
            }
        }

        if (!filesFound) 
        {
            System.out.println("No files found with extension "+ extension+ " in the Folder");
        }
    }
}


/*
 * 
OUTPUT 1:
Enter the file extension: .c
Files with extension .c in folder C:\Users\menag\Downloads\MAR:
No files found with extension .c in the Folder
BUILD SUCCESSFUL (total time: 5 seconds)
   
OUTPUT 2 :
Enter the file extension: .java
Files with extension .java in folder C:\Users\menag\Downloads\MAR:
get_thread_name.java
BUILD SUCCESSFUL (total time: 9 seconds)


 */