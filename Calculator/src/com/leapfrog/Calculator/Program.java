/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Calculator;

import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
        System.out.println("Enter First Number: ");
        double fnumber = input.nextDouble();
        System.out.println("Enter Second Number: ");
        double snumber = input.nextDouble();
        
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("5.Power");
        System.out.println("6.Exit");
        
        System.out.println("Enter your choice[1-6]");
        int choice = input.nextInt();
        
        if(choice == 1){
            System.out.println("The result is : " + (fnumber + snumber));
    }  else if(choice == 2){
            System.out.println("The result is : " + (fnumber - snumber));
    }
    else if(choice == 3){
        System.out.println("The result is : " + (fnumber / snumber));
    } else if(choice == 4){
        System.out.println("The result is : " + (fnumber * snumber));
    } else if(choice == 5){
        System.out.println("The result is : " + (Math.pow(fnumber, snumber)));
    } else {
        System.exit(0);
    }
       System.out.println("Do you want to continue?[Y/N]");
       String ch = input.next();
       if(ch.equalsIgnoreCase("n")){
           System.exit(0);
       }
    }
    
    }
    
}
