package org.example.height;

import java.util.Scanner;

public class HeightConvertorMain {
     public static void handleDistanceConversion() {
        Scanner scanner = new Scanner(System.in);
        HeightConvertor heightConvertor = new HeightConvertor();
        while (true) {
            System.out.println("Distance Conversion Menu:");
            System.out.println("1. Meters to Kilometers");
            System.out.println("2. Kilometers to Meters");
            System.out.println("3. Meters to CentiMeters");
            System.out.println("4. CentiMeters to Meters");
            System.out.println("5. CentiMeters to MM");
            System.out.println("6. Meters to MM");
            System.out.println("7. Exit");
            System.out.print("Choose a distance conversion option: ");

            int distanceChoice = scanner.nextInt();

            if (distanceChoice == 7) {
                System.out.println("Exiting");
                break;
            }

            System.out.print("Enter number you want to convert: ");
            double distance = scanner.nextDouble();
            // Perform the selected operation based on the user's choice
            switch (distanceChoice) {
                case 1:
                    heightConvertor.mtokm(distance);
                    break;
                case 2:
                    heightConvertor.kmtom(distance);
                    break;
                case 3:
                    heightConvertor.mtocm(distance);
                    break;
                case 4:
                    heightConvertor.cmtom(distance);
                    break;
                case 5:
                    heightConvertor.cmtomm(distance);
                    break;
                case 6:
                    heightConvertor.mtomm(distance);
                    break;
            }

        }


    }
}
