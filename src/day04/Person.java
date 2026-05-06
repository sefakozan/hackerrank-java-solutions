package day04;

import java.util.Scanner;

public class Person {
    // Tracks the current age for this instance.
    private int age;

    Person(int initialAge) {
        // Normalize negative ages to zero and print the required message.
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Print the age category based on the current age.
        if (age < 13) {
            System.out.println("You are young.");
        }
        else if (age < 18) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are old.");
        }
    }

    public void yearPasses() { this.age++; }

    public static void main(String[] args) {
        // Read test cases from standard input.
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int age = scanner.nextInt();

            // Create a person, print current age group, then age three years.
            Person person = new Person(age);
            person.amIOld();

            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }

            person.amIOld();
            System.out.println();
        }

        // Close the scanner to release the input resource.
        scanner.close();
    }
}
