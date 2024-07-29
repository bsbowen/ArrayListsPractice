package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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

        // Initialize a variable to hold the sum of the integers
        int sum = 0;

        // Loop through the list and sum the integers
        for (int num : integers) {
            sum += num;
        }

        // Print the list of integers);
        for (int i = 0; i < integers.size(); i++) {
            if (i == integers.size() - 1) {
                System.out.print("and " + integers.get(i) + " were the items in the list.");
            } else {
                System.out.print(integers.get(i) + ", ");
            }
        }
        // Print the sum of the list
        System.out.print(" The sum of that list is: " + sum);
    }
}
