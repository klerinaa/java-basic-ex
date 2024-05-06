package org.example;

import org.example.acceleration.AccelerationConvertor;
import org.example.height.HeightConvertorMain;
import org.example.weight.WeightConverterMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Memory memory =new Memory();
        HeightConvertorMain heightConvertorMain=new HeightConvertorMain();
        WeightConverterMain weightConverterMain= new WeightConverterMain();
        boolean exit = false;

        while (!exit) {
            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Distance");
            System.out.println("2. Weight");
            System.out.println("3. Handle Memory Functions");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    heightConvertorMain.handleDistanceConversion();
                    break;
                case 2:
                    weightConverterMain.handleWeightConversion();
                    break;
                case 3:
                    handleMemoryFunctions(scanner,memory);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void handleMemoryFunctions(Scanner scanner, Memory memory) {
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
                memory.addToMemory(valueToAdd);
                System.out.println("Value added to memory.");
                break;
            case 2:
                memory.clearMemory();
                System.out.println("Memory cleared.");
                break;
            case 3:
                double recalledValue = memory.recallMemory();
                System.out.println("Recalled value from memory: " + recalledValue);
                break;
            default:
                System.out.println("Invalid memory function. Please select a valid function.");
        }
    }
}