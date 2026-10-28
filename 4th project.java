
package edu.zuj.oop;

import java.util.Scanner;


public class project {

    
    public static void main(String[] args) {
         System.out.print("Enter the number in cels:");
         Scanner s=new Scanner(System.in);
         int temp=s.nextInt();
         double feh=(temp*1.8+32);
         System.out.println("temp in feh="+feh);
    }
    
}
