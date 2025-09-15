// Created by :
// Group:10BDate:
// Topic:
// Date:
// Check the Input-Process-Output steps

import java.util.Scanner;

//Step 1: Seeting Class name and Scanner

public class VacationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Step 2: Collect input

        // Get destination
        System.out.print("Enter your dream destination: ");
        String destination = input.nextLine();
        
        // Get costs
        System.out.print("Flight cost: $");
        double flightCost = input.nextDouble();
        
        System.out.print("Hotel cost per night: $");
        double hotelPerNight = input.nextDouble();
        
        System.out.print("Number of nights: ");
        int nights = input.nextInt();
        
        System.out.print("Food cost per day: $");
        double foodPerDay = input.nextDouble();
        
        System.out.print("Activities budget: $");
        double activities = input.nextDouble();
        
        // Step3:  Process data

        // Calculate totals
        double hotelTotal = hotelPerNight * nights;
        double foodTotal = foodPerDay * nights;
        double grandTotal = flightCost + hotelTotal + foodTotal + activities;
        


        // Step 4: Display results
        System.out.println("\n=== VACATION BUDGET ===");
        System.out.println("Destination: " + destination);
        System.out.printf("Flight: $%.2f%n", flightCost);
        System.out.printf("Hotel (%d nights): $%.2f%n", nights, hotelTotal);
        System.out.printf("Food (%d days): $%.2f%n", nights, foodTotal);
        System.out.printf("Activities: $%.2f%n", activities);
        System.out.println("-------------------");
        System.out.printf("TOTAL COST: $%.2f%n", grandTotal);
        
        // Closing scanner
        input.close();
    }
}
