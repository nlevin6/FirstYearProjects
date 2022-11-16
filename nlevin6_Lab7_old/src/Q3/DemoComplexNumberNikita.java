/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 19, 2022
Description: This code will give the user options to pick if they want to add, subtract, multiply, or divide the two complex formulas
             The multiplication and division calculations are done in polar form, then converted back into complex form.
             Because division and multiplication operations are simpler to do in polar form, so it would be possible to convert it back to it's
             complex form later in the end.
----------------------------------------------------------*/
package Q3;

import Lab6Q.MyMethod;

import java.util.Scanner;

public class DemoComplexNumberNikita {
    public static void main(String[] args) {
        MyMethod.myHeader("Nikita Levin", 7, 3);

        RecComplexNum x = new RecComplexNum(1, -2);
        RecComplexNum y = new RecComplexNum(-3, 4);

        System.out.print("You have entered the following two complex numbers x and y: ");
        System.out.print("\nx = ");
        x.displayRecForm();//displays the equation x
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", x.getMagnitude(), x.getAngle());

        System.out.print("\ny = ");
        y.displayRecForm();// displays the equation y
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", y.getMagnitude(), y.getAngle());

        System.out.print("\n\nComplex Number Calculator: ");

        char choice;
        Scanner userChoice = new Scanner(System.in);

        while (true) {
            System.out.print("\n==================");
            System.out.print("\na: Addition");
            System.out.print("\nb: Subtraction");
            System.out.print("\nc: Multiplication");
            System.out.print("\nd: Division");
            System.out.print("\ne: Exit");
            System.out.print("\n==================");
            System.out.print("\nEnter your choice: ");
            choice = userChoice.next().charAt(0);
            if (choice == 'e') {//if user picked e, don't even go into switch statements, just break out of the while loop and end the program
                break;
            }
            switch (choice) {
                case 'a': //addition case
                    System.out.print("x + y = ");
                    addComplexNumbers(x, y).displayRecForm();//print the newly added up formula
                    double a_Magnitude = addComplexNumbers(x, y).getMagnitude();//store magnitude and angle in variables to be used in a printf format
                    double a_Angle = addComplexNumbers(x, y).getAngle();
                    System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", a_Magnitude, a_Angle);
                    break;
                case 'b': //subtraction case
                    System.out.print("x - y = ");
                    subtractComplexNumbers(x, y).displayRecForm();//print the newly subtracted formula
                    double b_Magnitude = subtractComplexNumbers(x, y).getMagnitude();//store magnitude and angle in variables to be used in a printf format
                    double b_Angle = subtractComplexNumbers(x, y).getAngle();
                    System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", b_Magnitude, b_Angle);
                    break;
                case 'c': //fix this
                    System.out.print("x * y = ");
                    multiplyComplexNumbers(x, y).displayRecForm();//print the newly multiplied formula
                    double c_Magnitude = multiplyComplexNumbers(x, y).getMagnitude();//store magnitude and angle in variables to be used in a printf format
                    double c_Angle = multiplyComplexNumbers(x, y).getAngle();
                    System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", c_Magnitude, c_Angle);
                    break;
                case 'd': //fix this
                    System.out.print("x / y = ");
                    divideComplexNumbers(x, y).displayRecForm();//print the newly divided formula
                    double d_Magnitude = divideComplexNumbers(x, y).getMagnitude();//store magnitude and angle in variables to be used in a printf format
                    double d_Angle = divideComplexNumbers(x, y).getAngle();
                    System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees", d_Magnitude, d_Angle);
                    break;

                default:
                    System.out.print("Invalid Choice!");

            }

        }
        MyMethod.myFooter("\n*** Goodbye from Nikita Levin! ***");

    }


    public static RecComplexNum addComplexNumbers(RecComplexNum x, RecComplexNum y) {
        /*Declaring a RecComplexNum reference variable res to hold on to the result of
          the addition. This is instantiated with the added values of the fields referred to
          by x and y*/
        RecComplexNum res = new RecComplexNum(x.getReal() + y.getReal(), x.getImaginary() + y.getImaginary());
        return res;//Return the reference variable res of type RecComplexNum
    }

    public static RecComplexNum subtractComplexNumbers(RecComplexNum x, RecComplexNum y) {//same thing previous method but it subtracts x and y values
        RecComplexNum res = new RecComplexNum(x.getReal() - y.getReal(), x.getImaginary() - y.getImaginary());
        return res;
    }

    /*the only reason im going from complex to polar then back to complex is because multiplication and addition for complex numbers are done
    much easier in the polar form. Once I do the math in polar form, I switch back to complex form and return the result.*/

    public static RecComplexNum divideComplexNumbers(RecComplexNum x, RecComplexNum y) {//divides complex numbers using their magnitude and angle and returns the results
        double finalMag = x.getMagnitude() / y.getMagnitude();//magnitude after division
        double finalAngle = x.getAngle() - y.getAngle();//angle after division

        PolarComplexNum pc = new PolarComplexNum(finalMag, finalAngle);// make instance object of PolarComplexNum, and put the calculated magnitude and angle through

        //make new instance of type RecComplexNum and use the imaginary and real values from PolarComplexNum to be passed into the enw object instance
        RecComplexNum res = new RecComplexNum(pc.getRealValue(), pc.getImaginaryValue());

        return res;
    }

    public static RecComplexNum multiplyComplexNumbers(RecComplexNum x, RecComplexNum y) {//same as previous method except im multiplying instead
        double finalMag = x.getMagnitude() * y.getMagnitude();
        double finalAngle = x.getAngle() + y.getAngle();

        PolarComplexNum pc = new PolarComplexNum(finalMag, finalAngle);

        RecComplexNum res = new RecComplexNum(pc.getRealValue(), pc.getImaginaryValue());
        return res;
    }

}
