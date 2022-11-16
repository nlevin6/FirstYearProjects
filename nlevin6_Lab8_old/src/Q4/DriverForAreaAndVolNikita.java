/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Apr 02, 2022
Description: This class will generate a random radius between 2-3 cm and height between 4-7 cm,
             and it will calculate the result of the cone's and cylinder's volumes and surface areas
----------------------------------------------------------*/
package Q4;

import Lab6Q.MyMethod;

public class DriverForAreaAndVolNikita {
    public static void main(String[] args) {
        MyMethod.myHeader("Nikita Levin", 8, 4);

        double r = Math.random() * 1 + 2;//random number between 2 and 3
        double h = Math.random() * 3 + 4;//random number between 4 and 7

        Geometric3DObject cone = new RightCircularCone(r, h);
        Geometric3DObject cylinder = new RightCylinder(r, h);

        printResult(cone);//print cone results
        System.out.println("\n");
        printResult(cylinder);//print cylinder results by calling the printResult method

        MyMethod.myFooter("\n\n*** Goodbye from Nikita Levin! ***");
    }

    public static void printResult(Geometric3DObject anyName) {//takes argument of type Geometric3DObject only
        System.out.print(anyName.toString());//prints results
    }
}
