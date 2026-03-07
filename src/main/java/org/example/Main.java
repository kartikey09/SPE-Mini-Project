package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();

        System.out.println("---------- Scientific Calculator (SPE Mini-Project) ----------");
        
        while (true) {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            if (choice == 5) {
                System.out.println("Exiting... Goodbye!");
                break;
            }

            System.out.print("Enter value: ");
            double val = scanner.nextDouble();

            switch (choice) {
                case 1: System.out.println("Result: " + calc.squareRoot(val)); break;
                case 2: System.out.println("Result: " + calc.factorial((int)val)); break;
                case 3: System.out.println("Result: " + calc.logarithm(val)); break;
                case 4: 
                    System.out.print("Enter exponent: ");
                    double exp = scanner.nextDouble();
                    System.out.println("Result: " + calc.power(val, exp)); 
                    break;
                default: System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
