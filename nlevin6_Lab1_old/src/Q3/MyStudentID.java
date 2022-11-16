/*-------------------------------------------------------------------------
Name: Nikita Levin
Student ID: 251056228
Date: Jan. 20th, 2022
Description: This will print the last 4 digits of my student number, the square root of that number,
             and the sum of that number with 2022
 ------------------------------------------------------------------------*/

package Q3;

public class MyStudentID {
    public static void main(String[] args) {
        int myStudentNumber = 6228; // store the last 4 digits of my student number in int variable named myStudent Number
        System.out.println("The last 4 digits of my student number are: " + myStudentNumber); //print the int in the console
        System.out.println("The square root of " + myStudentNumber + " is: " + Math.sqrt(myStudentNumber)); //print the square root of the number
        System.out.println("The addition of " + myStudentNumber + " and 2022 is: " + (myStudentNumber + 2022)); //add the number to 2022
    }
}
