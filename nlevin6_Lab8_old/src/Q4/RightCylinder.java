/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Apr 02, 2022
Description: This is the object class for cylinder which calculates the area and volume
----------------------------------------------------------*/
package Q4;

import Lab6Q.MyMethod;

public class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface {
    public RightCylinder() {
    }

    public RightCylinder(double r, double h) {
        super(r, h);
    }

    public double getArea() {
        double area = 2 * PI * getR() * (getR() + getH());//calc area, bring radius and height from parent class
        return area;
    }

    public double getVolume() {
        double volume = PI * MyMethod.myPow(getR(), 2) * getH();//calc volume
        return volume;
    }

    public String toString() {//print results, bring in toString info from parent class
        return String.format(super.toString() + "Cylinder's Volume: %.2f cubic cm\nCylinder's Surface Area: %.2f sq. cm", getVolume(), getArea());
    }
}
