package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the integers entered by the user
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter integers (0 to stop):");

        // Loop to take user inputs until zero is entered
        while (true) {
            int input = scanner.nextInt();
            // Break the loop if the input is zero
            if (input == 0) {
                break;
            }
            // Add the input integer to the ArrayList
            integers.add(input);
        }

        // Print the message indicating that input is complete
        System.out.println("Done entering integers into the list");

        // Prompt the user for the integer to find
        System.out.println("What number are you looking for in the list?");
        int target = scanner.nextInt();

        // Get the index of the target integer in the list
        int index = integers.indexOf(target);

        // Check if the target integer is in the list and print its index
        if (index != -1) {
            // Print all indices of the target integer
            for (int i = 0; i < integers.size(); i++) {
                if (integers.get(i) == target) {
                    System.out.println(target + " is at index " + i);
                }
            }
        } else {
            // Inform the user if the target integer is not in the list
            System.out.println(target + " is not in the list.");
        }
    }
}