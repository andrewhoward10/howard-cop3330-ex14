/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double order;
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("What is the order amount: ");
        order = keyboardInput.nextDouble();



        System.out.print("What is the state: ");
        String state = keyboardInput.next();

        if(state.equals("WI")){
            System.out.println("The subtotal is $" + String.format("%.2f", order) + "\n" + "The tax is $" + String.format("%.2f", .055 * order) +  "\n" + "The total is $" + String.format("%.2f", (.055 * order)+order)  );
        }

          else{ System.out.print("The total is $" + String.format("%.2f", order) );}





    }
}
