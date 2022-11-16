/*--------------------
* Name: Nikita Levin
* Student Number: 251056228
* Date: Feb. 10, 2022
* Description: This code will print my information and 3 other example student's information using the Student object file
* -----------------*/

package Q3;

public class StudentDemoClassNikita {
    public static void main(String[] args) {
        myHeader("Nikita Levin", 4, 3);

        // create student instance here, using default constructor. give the object some characteristics
        Student me = new Student();//default object

        System.out.println("\nHere is my information:");
        System.out.println("=======================");
        System.out.printf("I am %s", me.getName()); //get the student info and print it
        System.out.printf("\nStudent Number: %d", me.getStudentNumber());
        System.out.printf("\nEmail address: %s", me.getEmail());
        System.out.printf("\nAge: %d", me.getAge());

        // create 3 more student instances here using the constructor with args
        Student student1 = new Student(250221375, "Addie","Slowgrave"); //using the other constructor
        Student student2 = new Student(250309716, "Talia","Hanscom");
        Student student3 = new Student(250136525, "Valeria","McCloughen");

        //print out the newly created students information here
        System.out.println("\n\nHere is the info on the other students: ");
        System.out.println("=============================");
        System.out.println("Number    Name");
        System.out.println("========= ===================");
        System.out.printf("%d %s", student1.getStudentNumber(), student1.getName());//get the 1st student info
        System.out.printf("\n%d %s", student2.getStudentNumber(), student2.getName());//get the 2nd student info
        System.out.printf("\n%d %s", student3.getStudentNumber(), student3.getName());//get the 3rd student info
        System.out.println("\n===========================");

        myFooter("\n*** Goodbye from Nikita! ***");

    }

    public static void myHeader(String fullName, int labNum, int quesNum) { //header method which prints the header
        String border = "************************";
        System.out.println(border);
        System.out.println(fullName);
        System.out.println("Lab " + labNum + ", Question " + quesNum);
        System.out.println(border);
    }

    public static void myFooter(String message) { //footer methods prints the footer
        System.out.println(message);
    }
}
