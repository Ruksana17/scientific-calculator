import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator!");

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Exit");

            System.out.print("Enter choice (1-7): ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            double result;

            switch (choice) {
                case 1:
                    result = add();
                    break;
                case 2:
                    result = subtract();
                    break;
                case 3:
                    result = multiply();
                    break;
                case 4:
                    result = divide();
                    break;
                case 5:
                    result = squareRoot();
                    break;
                case 6:
                    result = exponentiation();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    continue; // Go back to the beginning of the loop
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static double add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    private static double subtract() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    private static double multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    private static double divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter denominator: ");
        double denominator = scanner.nextDouble();
        
        if (denominator == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not a Number
        }

        return numerator / denominator;
    }

    private static double squareRoot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number!");
            return Double.NaN;
        }

        return Math.sqrt(num);
    }

    private static double exponentiation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        return Math.pow(base, exponent);
    }
}
