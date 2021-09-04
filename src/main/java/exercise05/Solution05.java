/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mohit Ballikar
 */
package exercise05;
import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanx = new Scanner(System.in);
        Scanner scany = new Scanner(System.in);

        System.out.print("What is your first number? ");
        String x = scanx.next();

        System.out.print("What is your second number? ");
        String y = scany.next();

        int x2 = Integer.parseInt(x);
        int y2 = Integer.parseInt(y);

        float division = (float)x2 / y2;


        System.out.print(x2  + " + " + y2 + " = " + (x2 + y2) + "\n" + x2 + " - " + y2 + " = " + (x2 - y2) + "\n" + x2 + " * " + y2 + " = " + (x2 * y2) + "\n" + x2 + " / " + y2 + " = " + division + "\n");
    }
}

/*
    Import the necessary scanner to allow for user input
    Define the scanners necessary for storing the first and second values as strings as directed
    Prompt the user for the said values and store them
    Redefine the values to integers from strings using parse function
    Print out all the manipulation (addition, multiplication, subtraction, division) for the user with proper formatting
    Additionally cast the divisor and dividends as floats to give more accurate answers
 */