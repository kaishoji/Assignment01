import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) throws Exception {
        // ---------------- CLASS HEADER ---------------------- 
        // CSE 110: Class#: 90548 / 08/19/21 - 12/03/21
        // Assignment: 01
        // Author: Kai Shoji Ohsawa / ID# 1216436000
        /* Description: The purpose of this assignment is to "... write a program to determine
         how to split a number of pizzas (each w/ the same amount of slices) */

        Scanner in  = new Scanner(System.in);

        int numPizzas, numAdults, numChildren, numSlices; 
        // creates four variables that are undeclared, awaiting user input to store values.

        System.out.println("Hello. How many pizzas were purchased?");
        numPizzas = in.nextInt(); 
        // stores value for the number of pizzas purchased.

        System.out.println("And how many slices per pizza will we be doing today?");
        numSlices = in.nextInt(); 
        // stores value for the number of slices per pizza.

        System.out.println("Thank you, and how many adults are eating?");
        numAdults = in.nextInt(); 
        // stores value for the number of adults eating.

        System.out.println("Lastly, how many children are eating?");
        numChildren = in.nextInt(); 
        // stores value for the number of children eating.

        int totalSlices = numPizzas * numSlices; 
        // calculates and stores the total number of slices.

        System.out.print("The total number of slices of pizza is: ");
        System.out.println(totalSlices);

        int adultSlices = numAdults * 2; 
        // calculates and stores the number of slices reserved for the adults.

        System.out.print("The total number of slices for the adults: ");
        System.out.println(adultSlices);

        int remainingSlices = totalSlices - adultSlices; 
        // calculates and stores the number of remaining slices.

        int totalAvailChildren = remainingSlices / numChildren;
        // calculates and stores the number of slices available for the children.

        int numLeftover = remainingSlices % numChildren;
        // calculates and stores the number of leftover slices after the adults and children take their slices.

        // prints the output desired by the assignment.
        // note: passes all logic tests!
        System.out.print("The total number of slices available for children: ");
        System.out.println(remainingSlices);
        System.out.print("The number of slices each child will get: ");
        System.out.println(totalAvailChildren);
        System.out.print("The number of slices left over: ");
        System.out.println(numLeftover);
    }
}
