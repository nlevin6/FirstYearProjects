/*--------------------
 * Name: Nikita Levin
 * Student Number: 251056228
 * Date: Feb. 10, 2022
 * Description: This code is showing different summations using strings, ints and chars to print different results
 * -----------------*/

package Q1;

import java.util.Scanner;

public class SumCity {
    public static void main(String[] args) {
        myHeader("Nikita Levin", 4, 1);

        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double firstNum = inputNum.nextDouble(); //take user input for numbers
        System.out.print("Enter a second real number: ");
        double secondNum = inputNum.nextDouble();
        System.out.printf("The sum of %.2f and %.2f is: %.2f", firstNum, secondNum, sumValues(firstNum, secondNum));

        System.out.print("\n\nEnter a character: ");
        Scanner inputChar = new Scanner(System.in);
        char firstChar = inputChar.next().charAt(0); //take character input at location 0 (first character from whatever the user types)
        System.out.print("Enter a second character: ");
        char secondChar = inputChar.next().charAt(0);
        System.out.printf("The sum of the characters '%c' and '%c': %c, the integer equivalent is %d.", firstChar, secondChar, (char) sumValues(firstChar, secondChar), sumValues(firstChar, secondChar));
        //cast the int back to char to print the unicode equivalent of the new char

        System.out.print("\n\nEnter your full name: ");
        Scanner inputName = new Scanner(System.in);
        String fullName = inputName.nextLine();
        System.out.printf("%s", sumValues("I am ", fullName)); //placeholder %s for string which will print the sum of the 2 strings using the overloaded method

        myFooter("\n\n*** Goodbye from Nikita! ***");
    }

    public static String sumValues(String str1, String str2) {
        return str1 + str2;
    }

    public static double sumValues(double num1, double num2) {
        return num1 + num2;
    }

    public static int sumValues(char char1, char char2) { //int will return the integer equivalents of the chars
        return char1 + char2;
    }

    public static void myHeader(String fullName, int labNum, int quesNum) { //header method which prints the header
        String border = "************************";
        System.out.println(border);
        System.out.println(fullName);
        System.out.println("Lab " + labNum + ", Question " + quesNum);
        System.out.println(border);
    }

    public static void myFooter(String message) {
        System.out.println(message);
    }
}
