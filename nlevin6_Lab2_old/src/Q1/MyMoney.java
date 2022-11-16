/*--------------------------------------------------------------------------------------------------------------------
Name: Nikita Levin
Student ID: 251056228
Date: 22 Jan. 2022
Description: The code will print a line with my full name, age and desired salary with the values that are assigned
             to each of the declared variables
 ---------------------------------------------------------------------------------------------------------------------*/
package Q1;

public class MyMoney {
    public static void main(String[] args) {
        String fullName = "Nikita Levin"; //declare string variable fullName and assign my name and last name as the value to the string
        int age = 24; // declare integer variable named age and assign the number 24 to it
        double salary = 100000.0; // declare the double variable, in order to be able to displace the decimal in the number, and assign a number to the double

        System.out.print("My name is " + fullName + ", my age is " + age + " and\nI hope to earn $" + salary + " per year.");
        //the line above will print all the information in 2 lines. the \n puts everything afterwards on a new line. The assigned variables will be printed
    }
}
