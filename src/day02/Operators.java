package day02;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the meal cost as a double (e.g., "12.00")
        // Using nextLine() + parse to avoid issues with mixed nextDouble/nextInt
        double mealCost = Double.parseDouble(scanner.nextLine().trim());
        int tipPercent = Integer.parseInt(scanner.nextLine().trim());
        int taxPercent = Integer.parseInt(scanner.nextLine().trim());

        // Compute and print the rounded total cost.
        Result.solve(mealCost, tipPercent, taxPercent);

        scanner.close();
    }
}

class Result {
    public static void solve(double mealCost, int tipPercent, int taxPercent) {
        // Calculate tip and tax amounts from percentages.
        double tip = mealCost * tipPercent / 100.0;
        double tax = mealCost * taxPercent / 100.0;
        // Sum the components for the total meal cost.
        double totalCost = mealCost + tip + tax;

        System.out.println(Math.round(totalCost));
    }
}
