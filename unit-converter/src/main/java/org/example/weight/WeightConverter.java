package org.example.weight;

import org.example.Memory;

public class WeightConverter {
    private Memory memory = new Memory();

    double gtokg(double weight){
        weight=weight /1000;
        memory.addToMemory(weight);
        System.out.println("The weight in kg is " + weight );
        return weight;
    }


      double poundsToKilograms(double weight) {
         weight=weight / 2.225;
         memory.addToMemory(weight);
         System.out.println("The weight in kg is " + weight );
         return weight;
    }


      double kilogramsToPounds(double weight) {
         weight=weight * 2.225;
         memory.addToMemory(weight);
         System.out.println("The weight in pounds is " + weight );
         return weight;
    }


}
