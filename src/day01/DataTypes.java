package day01;

import java.util.Scanner;

public class DataTypes {
    static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        int inInt = scanner.nextInt();
        double inDouble = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline
        String inString = scanner.nextLine();

        System.out.println(i + inInt);
        System.out.printf("%.1f%n", d + inDouble);
        System.out.println(s + inString);

        scanner.close();
    }
}
