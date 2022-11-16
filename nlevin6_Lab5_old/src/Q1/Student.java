/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Feb 24, 2022
Description: This creates the Student object class
----------------------------------------------------------*/
package Q1;

public class Student {
    //Field Declaration
    private String name;
    private int studentNumber;
    private int score;

    public Student() {//define a default constructor
        name = "Rick Grimes";
        studentNumber = 110106041;
        score = 71;
    }

    public Student(String nm, int num, int sc) {// constructor with args
        name = nm;
        studentNumber = num;
        score = sc;
    }

    public String getName() {// getter methods
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getLetterGrade() {// string method to convert the scores into letters
        if (score >= 90)// using the if, else if, else statements, it checks form top to bottom therefore no care about the range
            return "A+";
        else if (score >= 80)
            return "A-";
        else if (score >= 70)
            return "B+";
        else if (score >= 60)
            return "B-";
        else if (score >= 50)
            return "C+";
        else if (score >= 40)
            return "C-";
        else if (score >= 30)
            return "D";
        else
            return "F";
    }

    public void printInfo() {// declaring method, this method will print the student information
        System.out.printf("%-20s %-20d %d", name, studentNumber, score);// left justified, number of characters provided, int

    }

}
