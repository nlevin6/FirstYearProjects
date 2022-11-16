/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Feb 24, 2022
Description: This code will compare the grades of two students and declare which one is greater.
----------------------------------------------------------*/
package Q1;

public class StudentGradesByNikita {
    public static void main(String[] args) {
        myHeader("Nikita Levin", 5, 1);// calling the header method


        System.out.println("\nName              Student Number        Score        (Letter Grade)");
        String border1 = "-----------------------------------------------------------------------------";
        System.out.println(border1);

        Student s1 = new Student();//Declaring student Variable
        s1.printInfo(); // printing information about student 1
        System.out.print("         (Letter Grade: " + s1.getLetterGrade() + ")\n");

        Student s2 = new Student("Nikita Levin", 251056228, 60);// declaring student 2 variable and constructor with args
        s2.printInfo();
        System.out.print("         (Letter Grade: " + s2.getLetterGrade() + ")");

        System.out.println("\n" + border1);
        if (s1.getScore() > s2.getScore())// using the if ,else if statements to check which score is higher or if they are equal
            System.out.printf("Note: %s scored higher than %s", s1.getName(), s2.getName());
        else if (s2.getScore() > s1.getScore())
            System.out.printf("Note: %s scored higher than %s", s2.getName(), s1.getName());
        else
            System.out.println("Note: Their scores are equal!");

        myFooter("\n*** Goodbye from Nikita Levin! ***");
    }

    public static void myHeader(String fullName, int labNum, int quesNum) { //header method which prints the header
        String border = "******************";
        System.out.println(border);
        System.out.println(fullName);
        System.out.println("Lab " + labNum + ", Question " + quesNum);
        System.out.println(border);
    }

    public static void myFooter(String message) {
        System.out.println(message);
    }
}
