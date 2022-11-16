/*---------------------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 19, 2022
Description: This is the object which converts a binary number to decimal. Also can shift the binary numbers,
             shuffle the numbers to make a new combination, reverse the numbers, and shift the numbers to the right by one number.
 ---------------------------------------------------------------------*/
package Q2;

import Lab6Q.MyMethod;

public class BinaryToDecimal {
    private int[] binaryArray;

    public BinaryToDecimal() {

    }

    public BinaryToDecimal(int[] binaryNums) {
        binaryArray = binaryNums; //pass arg into the object instance
    }

    public void displayArray() {
        System.out.print("[");
        for (int i = 0; i < binaryArray.length; i++) {//loop through entire array
            int binaryNums = binaryArray[i];
            System.out.printf("%d ", binaryNums);//print numbers in the array
        }
        System.out.print("\b]");//removes last space from previous message

    }

    public int getDecimalValue() {
        double decimal = 0;
        int power = binaryArray.length - 1;//if array size is 4, start from 3
        for (int i = 0; i < binaryArray.length; i++) {
            decimal += binaryArray[i] * MyMethod.myPow(2, power);//do the calculation for decimal value here
            power--; //start counting from whatever the length of the binary array is down every loop
        }
        return (int) decimal;//convert number to int
    }

    public void doubleTheSizeZeroPadding() {
        int[] paddedArray = new int[binaryArray.length * 2]; // double the array size
        System.arraycopy(binaryArray, 0, paddedArray, binaryArray.length, binaryArray.length); // copy the array from the end
        //old array:   1 0 1 0  //new array: 0 0 0 0   1 0 1 0
        binaryArray = paddedArray; // overwrite the previous array with the padded array
    }

    public int[] reverseArray() {
        int[] savedArray = new int[binaryArray.length];
        for (int i = 0; i < savedArray.length; i++) {
            int pos = savedArray.length - 1; // save position of the last value
            pos = pos - i; // update position in reference to i
            int value = binaryArray[i]; //store value to be overwritten somewhere so it doesn't get lost
            savedArray[i] = binaryArray[pos]; // at the position i make it equal to value from the end, after pos got updated earlier
            savedArray[pos] = value; //put the stored value back to the end
        }
        return savedArray;

    }

    public void shiftRight() {
        int[] shiftedArray = new int[binaryArray.length];//1 1 0 0    // 0 1 1 0
        int lastVal = binaryArray[binaryArray.length - 1];// save last value somewhere
        System.arraycopy(binaryArray, 0, shiftedArray, 1, binaryArray.length - 1);// copy over all digits except for last
        shiftedArray[0] = lastVal;//copy over the last value to the beginning into the new array
        binaryArray = shiftedArray; // overwrite old array with the newly shifted array

    }

    public void shuffleArray() {
        for (int i = 0; i < binaryArray.length; i++) {
            int shuffle = (int) (Math.random() * binaryArray.length);
            int value = binaryArray[i]; // store value somewhere so it doesn't get lost
            binaryArray[i] = binaryArray[shuffle]; // take random number from array and overwrite that number
            binaryArray[shuffle] = value; // put the saved number into the position from where the shuffled value came from

        }

    }

}
