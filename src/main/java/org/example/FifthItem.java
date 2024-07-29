package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the strings entered by the user
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Enter strings (empty string to stop):");

        // Loop to take user inputs until an empty string is entered
        while (true) {
            String input = scanner.nextLine();
            // Break the loop if the input is an empty string
            if (input.isEmpty()) {
                break;
            }
            // Add the input string to the ArrayList
            strings.add(input);
        }

        // Check if the list has at least 5 strings
        if (strings.size() >= 5) {
            // Print the fifth string
            System.out.println("The fifth string is: " + strings.get(4));
        } else {
            // Inform the user if there are less than 5 strings
            System.out.println("There are less than 5 strings.");
        }
    }
}
