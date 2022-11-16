/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 30, 2022
Description: Object class for StudentInfo, inherits from the Name class
----------------------------------------------------------*/
package Q3;

public class StudentInfo extends Name {
    private int studentNumber;
    private CourseAndInstructor courseInfo;

    public StudentInfo() {

    }

    public StudentInfo(String fN, String lN, int sN, CourseAndInstructor cInfo) {
        super(fN, lN);//extends name because I just need the firstName and lastName fields passed
        studentNumber = sN;
        courseInfo = cInfo;
    }

    public String toString() {
        return super.toString() + "\nStudent Number: " + studentNumber + "\nCourse Name: " + courseInfo;//override toString method using the super from Name class
    }
}
