/*--------------------------------------------------------------------------------------------------------------------
Name: Nikita Levin
Student ID: 251056228
Date: 22 Jan. 2022
Description:
 ---------------------------------------------------------------------------------------------------------------------*/
package Q2;

import java.util.Scanner;

public class MathBugs {
    public static void main(String[] args) {
        int num = 0; //initialize variable num and assign a number to it as the default number
        int tensDigits = 0; //declare doubles which will store the first and second inputted numbers by the user
        int onesDigits = 0;
        double rootMeanSquare = 0;

        Scanner inputNumbers = new Scanner(System.in); // declare scanner object
        System.out.print("Pick two numbers between 11 and 99: "); // ask the user to pick a number between 11-99
        num = inputNumbers.nextInt(); //take the user input and store it in num

        tensDigits = num / 10; //math operation to get the first number, since it is an int it will round to a whole number down
        onesDigits = num % 10; //math operation to get the second number, using modulus which will give the remainder

        rootMeanSquare = Math.sqrt((Math.pow(tensDigits, 2) + Math.pow(onesDigits, 2)) / 2);// math operation to calculate the rms
        System.out.printf("%.2f", rootMeanSquare); //print the answer rounded to 2 decimals
    }
}
