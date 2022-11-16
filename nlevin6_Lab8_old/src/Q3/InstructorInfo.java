/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 30, 2022
Description: Object class for InstructorInfo, inherits from the Name class
----------------------------------------------------------*/
package Q3;

public class InstructorInfo extends Name {
    private String officeLocation;

    public InstructorInfo() {

    }

    public InstructorInfo(String fN, String lN, String oL) {
        super(fN, lN);
        officeLocation = oL;
    }

    public String toString() {
        return super.toString() + "\nOffice Location: " + officeLocation;//override using the existing toString from parent, plus something new from the child
    }
}
