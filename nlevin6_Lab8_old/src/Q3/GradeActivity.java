/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 30, 2022
Description: Given object class for GradeActivity, calculates averages of grades
----------------------------------------------------------*/
package Q3;

public class GradeActivity {
    private double[] grade;//fields of GradeActivity object
    private double score;
    private int outOf;
    private double percentScore;

    public GradeActivity() {
    }

    public GradeActivity(double score, int outOf) {//constructor that takes arguments double and int
        this.outOf = outOf;
        this.score = score;
    }

    public GradeActivity(double[] grade, int outOf) {//constructor that will take arguments of double array and int
        this.outOf = outOf;
        this.grade = grade;
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {//run through all values in the double array
            sum += grade[i];//add up all values in the array
        }
        if (outOf == 100)//if the integer outOf is 100 then set field score equal to the sum
            score = sum;
        else
            score = sum / grade.length;//otherwise, if not, set field score equal to sum of all grades, divided by amount of grades (calc average)
    }

    public double getScore() {
        return score;
    }

    public String getLetterGrade() {//return the letter based on the percentScore calculated
        percentScore = score / outOf * 100;
        if (percentScore >= 90) return "A+";
        else if (percentScore >= 80) return "A";
        else if (percentScore >= 70) return "B";
        else if (percentScore >= 60) return "C";
        else if (percentScore >= 50) return "D";
        else return "F";
    }

    @Override
    public String toString() {//override toString method
        //The arguments of String.format() is written in the same way as the arguments of printf()
        return String.format("%.2f (out of %d), Letter Grade: %s [%.2f%%]", score, outOf, getLetterGrade(), percentScore);
    }
}
