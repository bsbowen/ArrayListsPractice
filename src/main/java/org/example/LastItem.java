package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
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

        // Check if the list is not empty
        if (!strings.isEmpty()) {
            // Print the last string in the list
            System.out.println("The item in the list is: " + strings.get(strings.size() - 1));
        } else {
            // Inform the user if no strings were entered
            System.out.println("No strings were entered.");
        }
    }
}