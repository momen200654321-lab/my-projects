
package edu.zuj.oop.lecter2;

import java.util.Scanner;


public class test2 {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
         System.out.print("Enter the number:"); 
         int n1=s.nextInt();
         System.out.print("Entar the number:");
         int n2=s.nextInt();
         if (n1>n2)
         System.out.println(n1);
         else if (n1<n2)
          System.out.println(n2);
         else if (n1==n2)
           System.out.println("the numbers are equals:"+(n1));
               
    }
}
