package ifelse;

import java.util.Scanner;

public class ifElseExample5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a purchase value: ");
        double value = scanner.nextDouble();

        if (value >= 100.0) {
            System.out.println("10% discount applied.");
            double discount = value * 0.10;
            System.out.println(" New Value: " + (value - discount));
        } else {
            System.out.println("No discount available.");
            double discount = 0.0;
            System.out.println(" Value: " + (value - discount));
        }
        scanner.close();
    }
}
