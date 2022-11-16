/*---------------------------------------------------------------
Name: Nikita Levin
Student Number: 251056228
Date: Feb. 2, 2022
Description: This code will calculate the final grade using the sum of all grades and their corresponding weights
------------------------------------------------------------*/
package Q2;

import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args) {
        myHeader();// calling the header method

        Scanner input = new Scanner(System.in);// creating the scanner class
        System.out.println("Please input your 1st grade: ");// input grades and grade weights
        int firstGrade = input.nextInt();
        System.out.println("Please input your 1st grade weight: ");
        double gradeWeight1 = input.nextDouble();// input grades and grade weights

        System.out.println("Please input your 2nd grade: ");
        int secondGrade = input.nextInt();// input grades and grade weights
        System.out.println("Please input your 2nd grade weight: ");
        double gradeWeight2 = input.nextDouble();

        System.out.println("Please input your 3rd grade: ");
        int thirdGrade = input.nextInt();// input grades and grade weights
        System.out.println("Please input your 3rd grade weight: ");
        double gradeWeight3 = input.nextDouble();

        double finalGrade = firstGrade * gradeWeight1 + secondGrade * gradeWeight2 + thirdGrade * gradeWeight3;// calculate the final grade here
        System.out.printf("The course Grade is : %.2f", finalGrade);

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
