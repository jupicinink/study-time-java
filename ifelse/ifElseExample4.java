package ifelse;

import java.util.Scanner;

public class ifElseExample4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numer:");
        int number1 = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a second number:");
        int number2 = scanner2.nextInt();

        if(number1 > number2){
            System.out.println("The greater number is: " + number1);
        }else if (number2 > number1){
            System.out.println("The greater number is: " + number2);
        }else{
            System.out.println("Both numbers are equal.");
        }
        scanner.close();
        scanner2.close();
    }
}

