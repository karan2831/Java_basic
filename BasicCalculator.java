import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result;
        char operator;
        int choice = 0;

        do {
            System.out.println("\n--- Basic Calculator ---");
            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            if (operator == '+') {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operator == '-') {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operator == '*') {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero error!");
                }
            } else {
                System.out.println("Invalid operator!");
            }

            System.out.println("Press 1 to calculate again or 0 to exit.");
            choice = sc.nextInt();

        } while (choice != 0);

        System.out.println("Calculator closed.");
        sc.close(); // Close scanner
    }
}
