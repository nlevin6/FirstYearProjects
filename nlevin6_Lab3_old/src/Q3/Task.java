/*---------------------------------------------------------------
Name: Nikita Levin
Student Number: 251056228
Date: Feb. 2, 2022
Description: This code will convert user inputted cm value to inches
------------------------------------------------------------*/
package Q3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        myHeader("Nikita Levin", 3, 3); // call the header with the required data

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the length in cm: ");
        double length = input.nextDouble(); // get user input for length conversion
        System.out.printf(length + " cm = %.2f inch", cmToInchConverter(length)); // round the conversion to 2 decimals
        myFooter("\n\n*** Signing off - Nikita Levin ***"); // call the footer method with the required input
    }

    public static void myHeader(String fullName, int labNum, int quesNum) { //create a separate method to make it look cleaner
        String border = "*******************************";
        System.out.println(border);
        System.out.println(fullName);
        System.out.println("Lab " + labNum + ", Question " + quesNum);
        System.out.println(border);
    }

    public static void myFooter(String message) {
        System.out.println(message);
    }

    public static double cmToInchConverter(double cm) {//this method converts cm to inches
        double inchConversion = 2.54;
        return cm / inchConversion;
    }
}
