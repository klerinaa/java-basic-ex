package org.example.height;

import org.example.Memory;

public class HeightConvertor {

    private Memory memory = new Memory();

     double mtokm(double height){
        height=height /1000;
        memory.addToMemory(height);
        System.out.println("The height in km is " + height );
        return height;
    }
     double kmtom(double height){
        height=height *1000;
        memory.addToMemory(height);
        System.out.println("The height in m is " + height );
        return height;
    }
     double mtocm(double height){
        height=height *100;
        memory.addToMemory(height);
        System.out.println("The height in cm is " + height );
        return height;
    }

     double cmtom(double height){
        height=height /100;
        memory.addToMemory(height);
        System.out.println("The height in m is " + height );
        return height;
    }
     double cmtomm(double height){
        height=height *10;
        memory.addToMemory(height);
        System.out.println("The height in mm is " + height );
        return height;
    }
    double mtomm(double height){
        height=height *1000;
        memory.addToMemory(height);
        System.out.println("The height in mm is " + height );
        return height;
    }
}
