
package edu.zuj.oop.hw;

import java.util.Scanner;


public class hwsolve {

    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Enter the number:");
        double n1=s.nextInt();
        System.out.println("**********************");
        System.out.println("1-from cm to inch");
        System.out.println("2-frome inch to cm");   
        System.out.println("3-from m to feet");
        System.out.println("4-from feet to m");
        System.out.println("5-from cels to fenh");
        System.out.println("6-from fenh to cels");
        System.out.println("7-from hektar to dunm");
        System.out.println("8-from dunm to hekter");
        System.out.println("***********************");
        System.out.print("enter your choice:");
        int n2=s.nextInt();
        double result=0;
        switch(n2){
            case 1:result=(n1/2.54);break;
            case 2:result=(n1*2.54);break;
            case 3:result=(n1*3.28084);break;
            case 4:result=(n1*0.3048);break;
            case 5:result=(n1*1.8+32);break;
            case 6:result=((n1-32)*5/9);break;
            case 7:result=(n1*10);break;
            case 8:result=(n1*0.1);break;
            default:System.out.println("not available choice");
        
               }
        System.out.println("the result is:"+result);
        }
        
        
        
        
        
               
        
    }
      
