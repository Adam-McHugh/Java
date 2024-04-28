
package Address;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String lastName; // variable String input user last name
        String firstName; // variable string inout user first name
        String middleName; // variable String input user middle name
        String fullName; // Initial of first name, middle name + full Surname
        String houseNumber; // variable numerical input
        String streetName; // variable string Street name
        String streetType; // variable string street, crt ,ave etc
        String streetAddress; // number + street + type
        String city; // variable City or Town
        String ageBracketMessage;
        int age; // variable Age as number input from keyboard
        char initialFirstName; // Initial
        char initialMiddleName; // initial

        // System messages for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you First Name:");
        firstName = input.next();

        System.out.println("Enter your Middle Name:");
        middleName = input.next();

        System.out.println("Enter you LastName");
        lastName = input.next();

        System.out.println("Enter your House Number:");
        houseNumber = input.next();

        System.out.println("Enter your Street Name:");
        streetName = input.next();

        System.out.println("Enter your Street Type:");
        streetType = input.next();

        System.out.println("Enter your City:");
        city = input.next();

        System.out.println("Enter your Age:");
        age = Integer.parseInt(input.next());

        // convert-processing variables to other variable characteristics

        initialFirstName = Character.toUpperCase(firstName.charAt(0));
        initialMiddleName = Character.toUpperCase(middleName.charAt(0));
        fullName = initialFirstName + "." + initialMiddleName + "." + lastName;

        streetAddress = houseNumber + " " + streetName + " " + streetType;

        if (age <= 20) {
            ageBracketMessage = "Age Bracket: 20 or under";
        } else if (age >= 21 && age <= 35) {

            ageBracketMessage = "Age Bracket: 21-35";
        } else if (age >= 36 && age <= 70) {
            ageBracketMessage = "Age Bracket: 36-70";
        } else {
            ageBracketMessage = "Age Bracket: 71 and over";
        }

        // System to display on screen results of user inputs.
        System.out.println("customer provided detail:\n");
        System.out.println(fullName);
        System.out.println(streetAddress);
        System.out.print(city + "\n");
        System.out.print(ageBracketMessage + "\n");
    }
}
