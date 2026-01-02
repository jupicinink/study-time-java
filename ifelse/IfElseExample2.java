package ifelse;

import java.util.Scanner;

public class IfElseExample2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a media: ");
        double number = scanner.nextDouble();

        if (number >= 7.0) {
            System.out.println("The student is approved.");
        } else if (number <= 6.9 && number >= 5.0) {
            System.out.println("The student is in recovery.");
        } else {
            System.out.println("The student is disapproved.");
        }
    }
}
