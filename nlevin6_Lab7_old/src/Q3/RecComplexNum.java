/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 19, 2022
Description: This code creates the ComplexNumber object
----------------------------------------------------------*/

package Q3;

import Lab6Q.MyMethod;

public class RecComplexNum {
    private double real;
    private double imaginary;

    public RecComplexNum() {
        real = 0;
        imaginary = 0;
    }

    public RecComplexNum(double re, double im) {
        real = re;
        imaginary = im;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    public double getAngle() {
        return Math.toDegrees(Math.atan2(imaginary, real));
    }

    public void displayRecForm() {
        if (imaginary < 0) //check to see if the code should put a positive or a negative in the equation
            System.out.printf("%.2f - %.2fi", real, Math.abs(imaginary)); //make imaginary absolute value just for the display, so it doesn't show 2 negative signs
        else
            System.out.printf("%.2f + %.2fi", real, imaginary);
    }
}
