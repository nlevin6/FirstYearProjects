/*---------------------------------------------------------------
Name: Nikita Levin
Student Number: 251056228
Date: Feb. 2, 2022
Description: This code will calculate the volume of the cone
------------------------------------------------------------*/

package Q1;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        myHeader(); //call the method to display the header
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter the height of the cone: ");
        double height = input.nextDouble(); //take height input from user

        System.out.println("Please enter the radius of the cone: ");
        double radius = input.nextDouble(); //take radius input from user

        double coneVolume = (Math.PI * Math.pow(radius, 2)) * height / 3; //calculate volume of the cone

        System.out.printf("The volume of the cone with the radius " + radius + " cm and height " + height + " cm" + " is: %.2f cubic cm", coneVolume);
    }

    public static void myHeader() { //create a separate method to make it look cleaner
        String border = "*******************************";
        System.out.println(border);
        System.out.println("Nikita Levin");
        System.out.println("251056228");
        System.out.println("Feb. 2, 2022");
        System.out.println("Calculating the volume of a cone");
        System.out.println(border);
    }

}
