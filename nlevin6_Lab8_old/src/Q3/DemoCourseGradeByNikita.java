/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 30, 2022
Description: This code uses overridden toString methods and inheritance to print
             student information and instructor information in one line of code,
             and to print the calculated marks for this course using all course grades
----------------------------------------------------------*/
package Q3;

import Lab6Q.MyMethod;

public class DemoCourseGradeByNikita {
    public static void main(String[] args) {
        MyMethod.myHeader("Nikita Levin", 8, 3);

        CourseAndInstructor courseIns = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB 361");
        StudentInfo sInfo = new StudentInfo("Nikita", "Levin", 251056228, courseIns);//passing the courseIns data to intake since this is the required data type
        System.out.print(sInfo.toString());//print all results using the overridden toString method

        double[] labG = new double[]{14.40, 15, 15, 15, 15, 15, 15, 15};//populate array with my lab grades labs 1-8 (out of 15)
        double[] quizG = new double[]{20, 20, 20, 18.67, 18.67};//populate array with my top 5 quiz grades (out of 20)
        double midtermMark = 24;//midterm grade (out of 25)
        double finalMark = 35;//midterm grade (out of 40)

        //instantiate objects
        GradeActivity avgLabG = new GradeActivity(labG, 15);
        GradeActivity avgQuizG = new GradeActivity(quizG, 20);
        GradeActivity midtermG = new GradeActivity(midtermMark, 25);
        GradeActivity finalG = new GradeActivity(finalMark, 40);

        System.out.print("\n===================");
        System.out.print("\n    Score Card     ");
        System.out.print("\n===================");

        //print results using the overridden toString method
        System.out.print("\nLab Grade: " + avgLabG.toString());
        System.out.print("\nQuiz Grade: " + avgQuizG.toString());
        System.out.print("\nMidterm Grade: " + midtermG.toString());
        System.out.print("\nFinal Exam Grade: " + finalG.toString());

        //populate array with the final scores for each section
        double[] finalScore = new double[]{avgLabG.getScore(), avgQuizG.getScore(), midtermG.getScore(), finalG.getScore()};
        GradeActivity courseG = new GradeActivity(finalScore, 100);
        System.out.print("\n===============================================================");
        System.out.print("\nCourse Grade: " + courseG.toString());
        System.out.print("\n===============================================================");

        double[] bonusG = new double[]{5, 0, 5, 5, 5, 5, 5, 5, 5, 5, 5};//populate array with bonus quiz marks
        GradeActivity avgBonusG = new GradeActivity(bonusG, 5);
        System.out.print("\nBonus Quiz Grade: " + avgBonusG.toString());
        GradeActivity reportedFinalG = new GradeActivity(courseG.getScore() + avgBonusG.getScore(), 100);//sum of final mark plus bonus
        System.out.print("\nReported Final Grade (with bonus): " + reportedFinalG);//final mark with bonus
        System.out.print("\n===============================================================");

        MyMethod.myFooter("\n\n*** Goodbye from Nikita Levin! ***");
    }
}
