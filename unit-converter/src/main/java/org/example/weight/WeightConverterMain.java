package org.example.weight;


import java.util.Scanner;

public class WeightConverterMain {
    public static void handleWeightConversion() {
        Scanner scanner = new Scanner(System.in);
        WeightConverter weightConverter = new WeightConverter();
        while (true) {
            System.out.println("Weight Conversion Menu:");
            System.out.println("1. Gram to Kilograms");
            System.out.println("2. Pounds to Kilograms");
            System.out.println("3. Kilograms to Pounds");
            System.out.println("4. Exit");
            System.out.print("Choose a weight conversion option: ");

            int weightChoice = scanner.nextInt();

            if (weightChoice == 4) {
                System.out.println("Exiting");
                break;
            }

            System.out.print("Enter number you want to convert: ");
            double weight = scanner.nextDouble();
            // Perform the selected operation based on the user's choice
            switch (weightChoice) {
                case 1:
                    weightConverter.gtokg(weight);
                    break;
                case 2:
                    weightConverter.poundsToKilograms(weight);
                    break;
                case 3:
                    weightConverter.kilogramsToPounds(weight);
                    break;

            }

        }


    }
}
