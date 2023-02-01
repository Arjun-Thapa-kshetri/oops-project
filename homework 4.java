package twentytwo.fall.oop.l4.a4;

import java.util.Scanner;
// Import the Scanner class
public class M22W0385{
    public static void main(String[] args){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        sc.close();
        System.out.println(fib(n));
//Printing number in Fibonacci series while enter the number
    }
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        // Base cases return itself 0 and 1
        else if(n==1){
            return 1;
        }
        else
        {
            return fib(n-1)+fib(n-2);
            // Recursive calls
        }
    }
}