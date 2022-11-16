/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 30, 2022
Description: Object class for CourseAndInstructor, inherits from the InstructorInfo class
----------------------------------------------------------*/
package Q3;

public class CourseAndInstructor extends InstructorInfo {
    private String courseName;

    public CourseAndInstructor() {

    }

    public CourseAndInstructor(String cN, String fN, String lN, String oL) {
        super(fN, lN, oL);
        courseName = cN;
    }

    public String toString() {
        return courseName + "\nInstructor's Info: \n" + super.toString();
    }
}
