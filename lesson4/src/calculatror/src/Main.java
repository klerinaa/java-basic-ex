import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            // Display menu
            System.out.println("Advanced Calculator");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Memory Functions");

            System.out.println("7. Exit");
            System.out.print("Select an operation (1/2/3/4/5/6/7): ");

            // Read user choice
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the calculator.");
                break;
            }

            // Read numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0.0; // Initialize the result variable

            // Perform the selected operation based on the user's choice
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                case 4:
                    try {
                        result = calculator.divide(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;
                    }
                    break;
                case 5:
                    try {
                        result = calculator.squareRoot(num1);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                        continue;
                    }
                    break;
                case 6:
                    handleMemoryFunctions(scanner, calculator);
                    continue;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    private static void handleMemoryFunctions(Scanner scanner, Calculator calculator) {

        System.out.println("Memory Functions:");
        System.out.println("1. Add to Memory (M+)");
        System.out.println("2. Clear Memory (MC)");
        System.out.println("3. Recall Memory (MR)");
        System.out.print("Select a memory function (1/2/3): ");

        int memoryChoice = scanner.nextInt();
        switch (memoryChoice) {
            case 1:
                System.out.print("Enter value to add to memory: ");
                double valueToAdd = scanner.nextDouble();
                calculator.addToMemory(valueToAdd);
                System.out.println("Value added to memory.");
                break;
            case 2:
                calculator.clearMemory();
                System.out.println("Memory cleared.");
                break;
            case 3:
                double recalledValue = calculator.recallMemory();
                System.out.println("Recalled value from memory: " + recalledValue);
                break;
            default:
                System.out.println("Invalid memory function. Please select a valid function.");
        }
    }
}
