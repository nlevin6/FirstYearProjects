/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 23, 2022
Description: This is this object class that calculates all the required data: average, highest value, lowest value, and standard deviation
----------------------------------------------------------*/
package Q2;

import Lab6Q.MyMethod;

public class WeeklySaleData_Nikita {
    double[] sale;

    public WeeklySaleData_Nikita() {
        sale = null;
    }

    public WeeklySaleData_Nikita(double[] sale) {
        this.sale = sale;
    }

    public double getAverageSale() {
        double sum = 0;
        for (int i = 0; i < sale.length; i++) {//loop through array, sum up all number in it
            sum += sale[i];
        }
        return sum / sale.length;//return average of sales sum divided by whatever length sale array is
    }

    public double getHighestSale() {
        double highestNum = 0;//store highest num here
        for (int i = 0; i < sale.length; i++) {//loop through array
            if (sale[i] > highestNum) {//check if current num in the loop is higher than num, if it is, overwrite highest num with a new value
                highestNum = sale[i];
            }
        }
        return highestNum;
    }

    public double getLowestSale() {//same as method above, but for lowest num
        double lowestNum = Double.MAX_VALUE;//set the double to the maximum possible double value (This is the number if your curious: 1.7976931348623157*10^308)
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < lowestNum) {
                lowestNum = sale[i];
            }
        }
        return lowestNum;
    }

    public void displaySaleData() {
        System.out.print("[");
        for (int i = 0; i < sale.length; i++) {//loop through array, print it
            System.out.printf("%.2f, ", sale[i]);
        }
        System.out.print("\b\b]\n");
    }

    public double getStandardDeviation() {
        double numerator = 0;
        double stDeviation = 0;
        for (int i = 0; i < sale.length; i++) {//calculate the sum of the numerator
            numerator += MyMethod.myPow(sale[i] - getAverageSale(), 2);
        }
        stDeviation = Math.sqrt(numerator / sale.length); //calc the standard deviation
        return stDeviation;
    }
}
