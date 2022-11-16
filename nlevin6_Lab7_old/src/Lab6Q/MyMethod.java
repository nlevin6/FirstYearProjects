/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 06, 2022
Description: This code will prompt the user to select if they want to calculate power, factorial sine, or cosine
             repetitively until the user decides to quit the program.
----------------------------------------------------------*/
package Lab6Q;

import java.util.Scanner;

public class MyMethod {
    public static void main(String[] args) {
        myHeader("Nikita Levin", 6, 1);

        while (true) {
            System.out.print("=================="); //display menu
            System.out.print("\na: Power Function");
            System.out.print("\nb: Factorial Function");
            System.out.print("\nc: Sine Function");
            System.out.print("\nd: Cosine Function");
            System.out.print("\ne: Exit");
            System.out.print("\n==================");

            System.out.print("\n\nEnter your choice: ");
            Scanner input = new Scanner(System.in);
            Scanner pickedNum = new Scanner(System.in); //store user numbers here for when they do math
            char userPick = input.next().charAt(0);//put user choice of operation here, select the first char in whatever they type

            switch (userPick) {
                case 'a':
                    System.out.print("POWER FUNCTION: Calculating x to the power of y");
                    System.out.print("\nEnter x: ");
                    double x = pickedNum.nextDouble(); //x is base
                    System.out.print("Enter y: ");
                    int y = pickedNum.nextInt(); //y is power
                    System.out.printf("%.2f^%d = %.2f\n\n", x, y, myPow(x, y));//call myPow to print x to the power of y
                    break;
                case 'b':
                    System.out.print("FACTORIAL FUNCTION: Calculating of n");
                    System.out.print("\nEnter n: ");
                    int n = pickedNum.nextInt(); //store picked number by user into variable n
                    System.out.printf("%d! = %.2f\n\n", n, myFactorial(n));//print the factorial of variable n
                    break;
                case 'c':
                    System.out.print("SINE FUNCTION: Calculating sin(k) degree.");
                    System.out.print("\nEnter k in degrees: ");
                    double k = pickedNum.nextDouble();//store user picked number into k
                    System.out.printf("sin(%.2f) degree = %.2f\n\n", k, mySin(myDegreeToRadian(k)));//convert the degrees to radians then using mySin calculate the sine
                    break;
                case 'd':
                    System.out.print("COSINE FUNCTION: Calculating cos(m) degree.");//same thing as sine above, except i the function to myCos to calculate the cosine
                    System.out.print("\nEnter m in degrees: ");
                    double m = pickedNum.nextDouble();
                    System.out.printf("cos(%.2f) degree = %.2f\n\n", m, myCos(myDegreeToRadian(m)));
                    break;
                case 'e'://if I don't have this then it will be printing invalid choice so i have to keep it here and make it do nothing
                    break;
                default:
                    System.out.print("Invalid choice");//in case user picks anything that is not a char between a-e
            }

            if(userPick == 'e'){//if user picked e break the loop and end the program
                myFooter("\n*** Goodbye from Nikita Levin! ***");
                break;
            }
        }

    }

    public static double myPow(double x, int y) {
        double ans = 1;
        if (y < 0) { // check if exponent is negative if it is, do the stuff inside
            while (y < 0) { //as long as y is less than 0 go inside and keep repeating
                ans *= x; //answer = answer times the base
                y++; //add 1 to y and keep repeating loop until y=0 then break out of the while loop
            }
            return 1 / ans; //if the exponent was negative return 1 divided by the answer.
        } else {
            while (y > 0) { //if the exponent is positive go inside this while loop
                ans *= x; //do the math
                y--; //subtract 1 from exponent and keep repeating loop until the exponent is 0
            }
            return ans; //if the exponent was positive just return the number without doing 1 over the answer
        }
    }

//    public static double myPow2(double x, double y, double answer) { // dont use this unless you really have to. recursive functions are bad
//        if (y < 0) {
//            return myPow2(x, y + 1, answer / x);
//        } else if (y > 0) {
//            return myPow2(x, y - 1, answer * x);
//        }
//        return answer;
//    }

    public static double myFactorial(int n) {//if n = 5 do 5*4*3*2*1
        double nfact = 1;
        if (n >= 0) { //check if the factorial is positive
            while (n > 1) { //as long as it is greater than 1 preform the stuff inside the while loop
                nfact *= n; //calc the new factorial here
                n--; //subtract one to move onto the next number, return to the top of the loop, rinse and repeat until n is = 1 then break out of the loop and print the answer
            }
            return nfact;
        } else { //if the factorial is negative tell the user to pick a positive
            System.out.print("Pick a positive factorial\n");
            return 0;
        }

    }

    public static double mySin(double x) {
        double y = 0; // value to store the answer
        for (int n = 20; n >= 0; n--) {//go through the iteration 20 times, each time brings it closer to the answer. Also Quazi just said to do it 20 times
            double p1 = myPow(-1, n); // numerator part
            double p2 = myFactorial(2 * n + 1); // denominator part
            double p3 = myPow(x, 2 * n + 1); // the power part that will be multiplied by the fraction p1/p2
            y = y + (p1 / p2) * p3; //overwrite what y is equal to every run to come closer to the answer with every iteration using the value from the previous run
        }
        return y; // return final answer
    }

    public static double myCos(double x) { //does same thing as mySin except I changed the formulas for p2 and p3
        double y = 0;
        for (int n = 20; n >= 0; n--) {
            double p1 = myPow(-1, n);
            double p2 = myFactorial(2 * n);
            double p3 = myPow(x, 2 * n);
            y = y + (p1 / p2) * p3;
        }
        return y; // return final answer when you break out of the for loop
    }

    public static double myDegreeToRadian(double degree) {
        return degree * Math.PI / 180; // converts degrees to radians
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
