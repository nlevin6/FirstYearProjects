/*--------------------
 * Name: Nikita Levin
 * Student Number: 251056228
 * Date: Feb. 10, 2022
 * Description: This is the Student object file with various getters and setters
 * -----------------*/

package Q3;

public class Student {
    private int studentNumber; //create student object "characteristics"
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int yearOfBirth;

    public Student(){ //default constructor
        studentNumber = 251056228;
        firstName = "Nikita";
        lastName = "Levin";
        emailAddress = "nlevin6@uwo.ca";
        yearOfBirth = 1997;
    }
    public Student(int sn, String fName, String lName) { //constructor with arguments
        studentNumber = sn; //accept the objects value (in the arguments) and assign them to the object's "characteristics"
        firstName = fName;
        lastName = lName;
        emailAddress = ""; //instructions explicitly said that
        yearOfBirth = 0; //instructions explicitly said that
    }

    //getter methods,which will get the required object characteristics depends on what I decide to get in the main class
    public String getName() {
        return firstName + " " + lastName; // returns the first and last name of the student
    }

    public int getStudentNumber() {
        return studentNumber; // return the student Number
    }

    public String getEmail() {
        return emailAddress; //return email address
    }

    public int getAge() {
        //id use a setter to set the age and calculate it there instead but UML chart has no setters mentioned
        return 2022 - yearOfBirth;
    }
}
