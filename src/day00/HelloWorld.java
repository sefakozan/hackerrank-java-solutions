package day00;

import java.util.Scanner;

public class HelloWorld {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();

        System.out.println("\nHello, World.");
        System.out.println(inputString);

        scan.close();
    }
}
