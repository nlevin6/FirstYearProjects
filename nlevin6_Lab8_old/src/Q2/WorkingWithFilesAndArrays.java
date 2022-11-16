/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 23, 2022
Description: This code will read data from a text file, print the results, calculate the average, highest value, lowest value,
             and standard deviation. Then add the new info back into the text file
----------------------------------------------------------*/
package Q2;

import Lab6Q.MyMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFilesAndArrays {
    public static void main(String[] args) throws IOException {
        MyMethod.myHeader("Nikita Levin", 8, 2);

        File myFile = new File("Datafile_Lab8.txt");//open file
        Scanner inputFromFile = new Scanner(myFile);//make scanner object instance to allow me to read the file later

        int lines = 0;
        while (inputFromFile.hasNextLine()) {//count number of lines in a file. doesn't work fix this. goes to infinity
            lines++;
            inputFromFile.nextLine();
        }
        inputFromFile.close();//have to close file before going on because i cant read the file a second time while its already open.
        //so close the file, then open it again to read it. open file first time just to count lines, second time to read lines.

        File myFileAgain = new File("Datafile_Lab8.txt");//open file again
        Scanner inputFromFileAgain = new Scanner(myFileAgain);//make scanner object instance to allow me to read the file later

        double[] data = new double[lines];//array to store data from file, same size as amount of lines in the data file
        for (int i = 0; i < data.length; i++) {
            double readData = inputFromFileAgain.nextDouble();//read the file and store that data in readData
            data[i] = readData;//populate array with data from file
        }
        inputFromFileAgain.close();//close file

        WeeklySaleData_Nikita salesData = new WeeklySaleData_Nikita(data);//pass data to this object instance
        //print info
        System.out.print("Reading the file...");
        System.out.print("\nHere is this week's sale-data...\n");
        salesData.displaySaleData();
        System.out.printf("Highest Weekly Sale: %.2f", salesData.getHighestSale());
        System.out.printf("\nLowest Weekly Sale: %.2f", salesData.getLowestSale());
        System.out.printf("\nAverage Weekly Sale: %.2f", salesData.getAverageSale());
        System.out.printf("\nStandard Deviation of Weekly Sale: %.2f", salesData.getStandardDeviation());
        System.out.print("\n.. Updating the file with the above info...\n Closed the file.....");

        //update file
        FileWriter fWriter = new FileWriter("Datafile_Lab8.txt", true);//allow writing to file
        PrintWriter appendFile = new PrintWriter(fWriter);//make instance which will allow me to append the file
        appendFile.printf("\n\nHighest Weekly Sale: %.2f", salesData.getHighestSale());
        appendFile.printf("\nLowest Weekly Sale: %.2f", salesData.getLowestSale());
        appendFile.printf("\nAverage Weekly Sale: %.2f", salesData.getAverageSale());
        appendFile.printf("\nStandard Deviation of Weekly Sale: %.2f", salesData.getStandardDeviation());
        appendFile.close();//close file

        MyMethod.myFooter("\n*** Signing off - Nikita Levin! ***");
    }
}
