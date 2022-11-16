/*--------------------
 * Name: Nikita Levin
 * Student Number: 251056228
 * Date: Feb. 10, 2022
 * Description: This will print the circle's radius, area, diameter, and circumference of the circle depending on what radius the user picks.
 * -----------------*/
package Q2;

import java.util.Scanner;

public class CircleInfoNikita {
    public static void main(String[] args) {
        myHeader("Nikita Levin", 4, 2);

        Circle myCircle = new Circle();// instance of a circle, to access it

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of the circle : ");
        double userRadius = input.nextDouble();
        myCircle.setRadius(userRadius);

        System.out.printf("\n The circle's radius is : %.3f", myCircle.getRadius());// accessing the object info about the radius
        System.out.printf("\n The circle's area is : %.3f", myCircle.getArea());// accessing the object info about the area
        System.out.printf("\n The circle's diamater is : %.3f ", myCircle.getDiameter());// accessing the object info about the diameter
        System.out.printf("\n The circle's circumference is : %.3f", myCircle.getCircumference());// accessing the object info about the circumference

        myFooter("\n\n*** Good Bye from Nikita Levin! ***"); // call the footer method with the required input
    }

    public static void myHeader(String fullName, int labNum, int quesNum) { //header method which prints the header
        String border = "**********";
        System.out.println(border);
        System.out.println(fullName);
        System.out.println("Lab " + labNum + ", Question " + quesNum);
        System.out.println(border);
    }

    public static void myFooter(String message) {
        System.out.println(message);
    }
}
