package day00;

import java.util.Scanner;

public class HelloWorld {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        System.out.println("\nHello, World.");
        System.out.println(inputString);

        scanner.close();
    }
}
