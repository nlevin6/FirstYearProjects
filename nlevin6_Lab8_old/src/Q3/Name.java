/*----------------------------------------------------------
Name: Nikita Levin
Student number: 251056228
Date: Mar 30, 2022
Description: Object class for Name, this is the parent class
----------------------------------------------------------*/
package Q3;

public class Name {
    private String firstName;
    private String lastName;

    public Name() {

    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Name: "+ firstName + " " + lastName;//override the toString method with this
    }
}
