package reading.elements;

import java.util.Scanner;

public class ReadAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt(); // user inputs
        }

        System.out.println("Entered elements are:");
        for (int num : elements) {
            System.out.println(num); // prints entered elements
        }

        scanner.close();
    }
}
