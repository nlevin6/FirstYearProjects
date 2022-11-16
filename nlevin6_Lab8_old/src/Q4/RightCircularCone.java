/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Apr 02, 2022
Description: This is the object class for cone which calculates the area and volume
----------------------------------------------------------*/
package Q4;
import Lab6Q.MyMethod;
public class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface {//parent class is Geometric3DObject

    //behave like the VolumeOf3DObjectsInterface class, sort of like a template
    public RightCircularCone() {
    }

    public RightCircularCone(double r, double h) {
        super(r, h);//construct using the parent constructor class Geometric3DObject
    }

    public double getArea() {//this child class will override the getArea method from the Geometric3DObject class
        double area = PI * getR() * (getR() + Math.sqrt(MyMethod.myPow(getH(), 2) + MyMethod.myPow(getR(), 2)));
        return area;
    }

    public double getVolume() {//this child class will override the getArea method from the VolumeOf3DObjectsInterface class
        double volume = (PI * MyMethod.myPow(getR(), 2) * getH()) / 3;
        return volume;
    }

    public String toString() {
        return String.format(super.toString() + "Cone's Volume: %.2f cubic cm\nCone's Surface Area: %.2f sq.cm", getVolume(), getArea());
    }
}
