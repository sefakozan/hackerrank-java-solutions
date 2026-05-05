package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conditionals {
    static void main(String[] args) throws IOException  {
        // TR: Standart girdiyi okumak icin okuyucu olusturur.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // TR: Girilen satiri tamsayiya cevirir.
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Print "Weird" for odd numbers.
        if (n % 2 == 1) {
            System.out.println("Weird");
        // Print "Not Weird" for even numbers in 2-5.
        } else if (n % 2 == 0 && (n >= 2 && n <= 5)) {
            System.out.println("Not Weird");
        // Print "Weird" for even numbers in 6-20.
        } else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        // Print "Not Weird" for even numbers greater than 20.
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }

        // Close the reader to free resources.
        bufferedReader.close();
    }
}
