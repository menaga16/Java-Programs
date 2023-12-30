/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs_PT;

import java.util.Scanner;

/**
 *
 * @author menaga
 */
public class get_thread_name {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter name for Thread 1: ");
        String t1name=scanner.nextLine();

        System.out.print("Enter name for Thread 2: ");
        String t2name=scanner.nextLine();
        
        MyRunnable obj=new MyRunnable();
        Thread t1=new Thread(obj,t1name);
        Thread t2=new Thread(obj,t2name);

        t1.start();
        t2.start();

        scanner.close();
    }
}

class MyRunnable implements Runnable {
    public void run() 
    {
        String threadName=Thread.currentThread().getName();
        System.out.println("Thread name: "+threadName);
    }
}
