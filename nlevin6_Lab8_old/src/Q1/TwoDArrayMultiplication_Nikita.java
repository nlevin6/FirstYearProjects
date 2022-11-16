/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 23, 2022
Description: This code lets user pick 2 matrices of whatever size they want, fill the matrices with random numbers
             between 2 and 5, then multiples the matrices and prints the results
----------------------------------------------------------*/
package Q1;

import Lab6Q.MyMethod;

import java.util.Scanner;

public class TwoDArrayMultiplication_Nikita {
    public static void main(String[] args) {
        MyMethod.myHeader("Nikita Levin", 8, 1);
        Scanner input = new Scanner(System.in);

        System.out.print("Multiply two 2D arrays: ");
        System.out.print("\nEnter array1 info: ");
        System.out.print("\nEnter row-size: ");
        int rowSizeFirst = input.nextInt();
        System.out.print("Enter column-size: ");
        int colSizeFirst = input.nextInt();

        System.out.print("Enter array2 info: ");
        System.out.print("\nEnter row-size: ");
        int rowSizeSecond = input.nextInt();
        while (rowSizeSecond != colSizeFirst) {//check if the size of second matrix is same as the size of the first matrix's columns
            System.out.print("Row size of the 2nd matrix has to be equal to the column size of first matrix!");
            System.out.print("\nEnter Again: ");
            rowSizeSecond = input.nextInt(); //update user input
        }
        System.out.print("Enter column-size: ");
        int colSizeSecond = input.nextInt();

        int[][] firstArray = new int[rowSizeFirst][colSizeFirst];//create the arrays of whatever size the user picked
        int[][] secondArray = new int[rowSizeSecond][colSizeSecond];

        populate2DArrays(firstArray);//populate both arrays
        populate2DArrays(secondArray);

        System.out.printf("\nElements of Array 1, Size[%d x %d]: \n", rowSizeFirst, colSizeFirst);
        display2DArrays(firstArray);
        System.out.printf("Elements of Array 2, Size[%d x %d]: \n", rowSizeSecond, colSizeSecond);
        display2DArrays(secondArray);

        System.out.print("\nMultiplying two arrays [Array 1 x Array 2].. \n");
        System.out.printf("The resultant size is: [%d x %d].", rowSizeFirst, colSizeSecond);
        System.out.print("\nThe elements are...\n");
        display2DArrays(multiplyArrays(firstArray, secondArray));
        MyMethod.myFooter("\n*** Signing off - Nikita Levin! ***");

    }

    public static void populate2DArrays(int[][] ma) {
        for (int row = 0; row < ma.length; row++) { //populate 2d array (using nested for loops)
            for (int col = 0; col < ma[row].length; col++) {//when looping through a column, loop through whatever size is each row at (ma[row])
                int randomNum = (int) (Math.random() * 4 + 2);//random num between 2-5 generated each run
                ma[row][col] = randomNum;
            }
        }

    }

    public static void display2DArrays(int[][] ma) {
        for (int row = 0; row < ma.length; row++) {//display the array (using nested for loops)
            for (int col = 0; col < ma[row].length; col++) {//when looping through a column, loop through whatever size is each row at (ma[row])
                System.out.printf("%3d", ma[row][col]); //%3d means use at least 3 spaces to display and pad automatically
            }
            System.out.println();//go to next line after finishing printing each column
        }
    }

    //(2x3) * (3x5) = (2x5) so k=0, N=3
    public static int[][] multiplyArrays(int[][] a, int[][] b) {
        //ex: a = [{2,3,3},{4,3,3}], b = [{2,4,2,3,3}, {4,3,2,2,3}, {3,4,2,4,3}], so array will be of size [2][5] (2x5 matrix)
        int[][] result = new int[a.length][b[0].length];
        for (int run = 0; run < a[0].length; run++) {//outer loop which needs to run the amount of times that the multiplications are happening. can also do b.length
            for (int row = 0; row < a.length; row++) {//in each summation iterate through the row
                for (int col = 0; col < b[0].length; col++) {//in every row go through each num
                    result[row][col] += (a[row][run] * b[run][col]);//add up the result for the particular cell
                }

            }

        }
        return result;
    }
}

