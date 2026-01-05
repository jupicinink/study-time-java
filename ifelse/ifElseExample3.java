package ifelse;

import java.util.Scanner;

public class ifElseExample3 {
    public static void main(String[] args) {
        int passwordsDefined = 1234;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password:");
        int password = scanner.nextInt();

        if(passwordsDefined == password){
            System.out.println("Access granted.");
        }else{
            System.out.println("Access denied.");
        }
        scanner.close();
        
    }
}

