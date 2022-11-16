/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 19, 2022
Description: This code creates the PolarComplexNum object. Used to calculate math in polar form
----------------------------------------------------------*/
package Q3;

import Lab6Q.MyMethod;

public class PolarComplexNum {
    private double magnitude;
    private double angle;

    public PolarComplexNum() {
        magnitude = 0;
        angle = 0;
    }

    public PolarComplexNum(double mag, double ang) {
        magnitude = mag;
        angle = ang;
    }

    //imaginary form: (𝑎 + 𝑏𝑖)
    public double getRealValue() {//𝑎 = 𝑚𝑐𝑜𝑠𝜃
        double toRad = MyMethod.myDegreeToRadian(angle); //convert angle to rad
        double resInRad = MyMethod.myCos(toRad);//calc cos angle using rad
        return magnitude * resInRad; //return the calculated result
    }

    public double getImaginaryValue() {//𝑏 = 𝑚𝑠𝑖𝑛𝜃.
        double toRad = MyMethod.myDegreeToRadian(angle); //same as the above method but for the imaginary part
        double resInRad = MyMethod.mySin(toRad);
        return magnitude * resInRad;
    }
}
