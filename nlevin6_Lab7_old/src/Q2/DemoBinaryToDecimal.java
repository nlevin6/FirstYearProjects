/*---------------------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 19, 2022
Description: This main class demonstrates all the things that the object BinaryToDecimal can do
 ---------------------------------------------------------------------*/
package Q2;

import Lab6Q.MyMethod;

public class DemoBinaryToDecimal {
    public static void main(String[] args) {
        MyMethod.myHeader("Nikita Levin", 7, 2);
        int[] myArray = new int[4];
        for (int i = 0; i < myArray.length; i++) {//populate array
            myArray[i] = (int) (Math.random() * 2);//generate random number between 0 and 1
        }
        BinaryToDecimal convert = new BinaryToDecimal(myArray);
        System.out.print("The 4 bit number: ");
        convert.displayArray();
        System.out.printf("\nThe corresponding decimal value is: %d", convert.getDecimalValue());
        convert.doubleTheSizeZeroPadding();
        System.out.print("\nThe 8 bit number, after the size is doubled and zero padded: ");
        convert.displayArray();
        System.out.printf("\nThe corresponding decimal value is: %d", convert.getDecimalValue());

        int[] reversedArray = convert.reverseArray(); //putting the reversed array into a new array
        BinaryToDecimal flippedArray = new BinaryToDecimal(reversedArray);//pass the reversed array
        System.out.print("\nThe 8 bit number after reversing the array: ");
        flippedArray.displayArray();
        System.out.printf("\nThe corresponding decimal value is: %d", flippedArray.getDecimalValue());
        System.out.print("\nThe 8 bit number after the shift right operation: ");
        flippedArray.shiftRight();
        flippedArray.displayArray();
        System.out.printf("\nThe corresponding decimal value is: %d", flippedArray.getDecimalValue());
        System.out.print("\nThe 8 bit number after the shuffling operation: ");
        flippedArray.shuffleArray();
        flippedArray.displayArray();
        System.out.printf("\nThe corresponding decimal value is: %d", flippedArray.getDecimalValue());

        MyMethod.myFooter("\n\n*** Goodbye from Nikita Levin! ***");
    }

}
