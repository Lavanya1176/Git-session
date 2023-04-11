import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        addition(scanner);
                        break;
                    case 2:
                        subtraction(scanner);
                        break;
                    case 3:
                        multiplication(scanner);
                        break;
                    case 4:
                        division(scanner);
                        break;
                    case 5:
                        percentage(scanner);
                        break;
                    case 6:
                        factorial(scanner);
                        break;
                    case 7:
                        square(scanner);
                        break;
                    case 8:
                        cube(scanner);
                        break;
                    case 9:
                        squareRoot(scanner);
                        break;
                    case 10:
                        power(scanner);
                        break;
                    case 11:
                        root(scanner);
                        break;
                    case 12:
                        System.out.println("Thank you for using the calculator.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid operation.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 12);
    }

    private static void addition(Scanner scanner) {
        System.out.print("Enter the number of operands: ");
        int n = scanner.nextInt();
        double result = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter operand " + i + ": ");
            result += scanner.nextDouble();
        }
        System.out.println("Result: " + result);
    }

    private static void subtraction(Scanner scanner) {
        System.out.print("Enter the number of operands: ");
        int n = scanner.nextInt();
        System.out.print("Enter operand 1: ");
        double result = scanner.nextDouble();
        for (int i = 2; i <= n; i++) {
            System.out.print("Enter operand " + i + ": ");
            result -= scanner.nextDouble();
        }
        System.out.println("Result: " + result);
    }

    private static void multiplication(Scanner scanner) {
        System.out.print("Enter the number of operands: ");
        int n = scanner.nextInt();
        double result = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter operand " + i + ": ");
            result *= scanner.nextDouble();
        }
        System.out.println("Result: " + result);
    }

    private static void division(Scanner scanner) {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        double result = dividend / divisor;
        System.out.println("Result: " + result);
    }

    
