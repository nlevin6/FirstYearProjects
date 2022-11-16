/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Feb 20, 2022
Description: This code calculates the addition and multiplication of 2 complex equations with real and imaginary parts
----------------------------------------------------------*/

package Q2;

import java.util.Scanner;

public class ComplexNumberDemoNikita {
    public static void main(String[] args) {
        myHeader("Nikita Levin", 5, 2);

        ComplexNumber x; //declare reference variables of type ComplexNumbers
        ComplexNumber y;

        Scanner input = new Scanner(System.in); //make scanner object instance called input

        System.out.print("Enter x's real number: ");
        double real1 = input.nextDouble(); //take user inputs and assign them to double type variables, for first equation, do the same for the second equation next
        System.out.print("Enter x's imaginary number: ");
        double imaginary1 = input.nextDouble();

        System.out.print("Enter y's real number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter y's imaginary number: ");
        double imaginary2 = input.nextDouble();

        x = new ComplexNumber(real1, imaginary1); //instantiate the variables
        y = new ComplexNumber(real2, imaginary2);

        System.out.println("You have entered the following two complex numbers x and y: ");
        System.out.print("x = ");
        x.displayRecForm(); //print the first formula, can't put it inside a print line, because this method is of void type, returns nothing
        System.out.print("\ny = ");
        y.displayRecForm(); //print the second formula

        ComplexNumber addRes; //declare reference variable of type ComplexNumber
        addRes = new ComplexNumber(real1 + real2, imaginary1 + imaginary2); //instance of addition of variables for the formula

        ComplexNumber mulRes; //declare reference variable of type ComplexNumber
        mulRes = new ComplexNumber(real1 * real2 - imaginary1 * imaginary2, imaginary1 * real2 + real1 * imaginary2); //instance of multiplication of variables for the formula

        System.out.print("\nHere are the results of the arithmetic operations: ");
        System.out.print("\nx + y = "); //show the line for addition of the two complex equations
        addRes.displayRecForm();
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", addRes.getMagnitude(), addRes.getAngle());

        System.out.print("\nx * y = ");//show the line for multiplication of the two complex equations
        mulRes.displayRecForm();
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", mulRes.getMagnitude(), mulRes.getAngle());

        myFooter("\n\n*** Goodbye from Nikita Levin! ***");
    }

    public static void myHeader(String fullName, int labNum, int quesNum) { //header method which prints the header
        String border = "************************";
        System.out.println(border);
        System.out.println(fullName);
        System.out.println("Lab " + labNum + ", Question " + quesNum);
        System.out.println(border);
    }

    public static void myFooter(String message) { //footer methods prints the footer
        System.out.println(message);
    }
}
