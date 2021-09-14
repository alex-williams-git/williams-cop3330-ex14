/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the amount? ");
        double subtotal = scan.nextDouble();

        Scanner newScan = new Scanner(System.in);

        System.out.print("What is the state? ");
        String state = newScan.nextLine();

        double tax = 0.0;
        double total = 0.0;

        if(state.equals("WI")){
            tax = Math.round((subtotal * .055) * 100.0) / 100.0;
            total = Math.round((subtotal + tax) * 100.0) / 100.0;

            System.out.println("The subtotal is $" + String.format("%.2f", subtotal));
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + total);

            System.exit(0);
        }

        System.out.println("The total is $" + String.format("%.2f", subtotal));
    }
}
