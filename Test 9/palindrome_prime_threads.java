/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs_PT;

/**
 *
 * @author menaga
 */
public class palindrome_prime_threads {
    
    public static void main(String[] args) throws InterruptedException {
        
        Thread obj1 = new Thread(new PalindromeRunnable());
        Thread obj2 = new Thread(new PrimeRunnable());
        
        obj1.start();
        obj1.join();
        obj2.start();
    }
}


class PalindromeRunnable implements Runnable {
    public void run() 
    {
        System.out.print("Palindrome numbers from 10 to 50: ");
        for (int i=10;i<=50;i++) 
        {
            if (isPalindrome(i)) 
            {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPalindrome(int n) {
        int original=n;
        int reverse=0;
        while (n!=0) {
            int digit=n%10;
            reverse=reverse*10+digit;
            n/=10;
        }
        return original==reverse;
    }
}

class PrimeRunnable implements Runnable 
{
    public void run() {
        System.out.print("\nPrime numbers from 0 to 10: ");
        for (int i=0;i<=10;i++) 
        {
            if (isPrime(i)) 
            {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n<=1) 
        {
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++) 
        {
            if (n%i==0) 
            {
                return false;
            }
        }
        return true;
    }
}

