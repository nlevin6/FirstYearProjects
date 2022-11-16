/*---------------------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 19, 2022
Description: This code generates a random number between 7 and 10, and showing highest and lowest
             numbers in the newly generated array of size 5, as well as removing those value from the
             same position and calculating a new average based on the numbers left in the array.
 ---------------------------------------------------------------------*/
package Q1;

import Lab6Q.MyMethod;

public class SimulateJudgesScore {
    public static void main(String[] args) {
        MyMethod.myHeader("Nikita Levin", 7, 1);
        double[] scores = new double[5]; //make array size 5
        System.out.print("Here are the scores from 5 Judges:");
        populateArray(scores); //populate the array
        displayArray(scores); //display the array
        System.out.printf("\n%-3sThe final score is: %.2f", " ", finalScore(scores));
        MyMethod.myFooter("\n\n*** Goodbye from Nikita Levin! ***");
    }

    public static void populateArray(double[] anyName) {
        for (int i = 0; i < anyName.length; i++)
            anyName[i] = Math.random() * 3 + 7;//random number between 7-10
    }

    public static void displayArray(double[] anyName) {
        System.out.print("\n[");
        for (int i = 0; i < anyName.length; i++) {
            double score = anyName[i];
            System.out.printf("%.2f, ", score);
        }
        System.out.print("\b\b]");//removes last comma and space from previous message
    }

    public static double finalScore(double[] anyName) {

        double[] newArray = new double[anyName.length];//make new array same size as the passed array
        System.arraycopy(anyName, 0, newArray, 0, anyName.length);//copy the array passed through, to the new array

        int highestIndex = 0;
        int lowestIndex = 0;//ex: [8.99, 8.78, 7.17, 8.11, 7.64]. first run nothing happens, second run i=1, high=0, aka if(8.99 < 9.78) then high=1 now (storing 8.99 in it)
        for (int i = 0; i < anyName.length; i++) {
            if (anyName[highestIndex] < anyName[i]) { //check if the value at the highest value index is smaller than the value of the index that its currently looping through
                highestIndex = i; //if it is then assign i to the highest index
            }
            if (anyName[lowestIndex] > anyName[i]) { //same thing but for smallest value index
                lowestIndex = i;
            }
        }
        System.out.printf("\n%-3sHighest Score: %.2f", " ", anyName[highestIndex]);//print results
        System.out.printf("\n%-3sLowest Score: %.2f\n", " ", anyName[lowestIndex]);

        newArray[highestIndex] = 0.00; // replace the highest and lowest numbers in the new array with 0
        newArray[lowestIndex] = 0.00;

        System.out.print("Here are the scores after discarding the highest and the lowest scores:");
        displayArray(newArray);//print the new array

        double sum = 0;
        double totalNums = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 0) //count how many non-zero numbers there are, so the program knows by how many numbers to divide to return the average
                totalNums++;
            sum += newArray[i]; //sum up all the numbers in the array
        }

        return sum / totalNums; //return average of all numbers in the array
    }
}
