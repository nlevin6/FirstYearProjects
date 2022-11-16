/*--------------------
 * Name: Nikita Levin
 * Student Number: 251056228
 * Date: Feb. 10, 2022
 * Description: This is the Circle object file with various getters and a setter which will calculate and define the circle object
 * -----------------*/
package Q2;

public class Circle {
    public double radius;// Circle object "characteristics"

    //no constructor, so java provides me with a default constructor automatically

    public void setRadius(double rad) {
        radius = rad;// setting the radius = rd
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;// calculating the area
    }

    public double getDiameter() {
        return radius * 2;// calculating the diameter
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;// calculating the circumference
    }
}
