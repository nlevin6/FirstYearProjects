/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Apr 02, 2022
Description: This is the parent object class of type abstract which cannot be instantiated.
             It takes the arguments for radius and height and passes is onto its children classes
----------------------------------------------------------*/
package Q4;

public abstract class Geometric3DObject {
    private double r;
    private double h;
    public double PI;

    protected Geometric3DObject() {

    }

    protected Geometric3DObject(double r, double h) {
        this.r = r;
        this.h = h;
        PI = Math.PI;

    }

    public double getR() {
        return r;
    }

    public double getH() {
        return h;
    }

    public abstract double getArea();//to be overridden in the child classes

    public String toString() {
        return String.format("Radius = %.2f cm, Height = %.2f cm\n", r, h);
    }
}
