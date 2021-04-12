package com.sfuentes;

import java.util.Scanner;

public class CalculateAverage {
    public double solution(){
        double total = 0;

        for(int i = 1; i <= 7; i++){
            Scanner input =new Scanner (System.in);
            System.out.println("Type in a number: ");
            double num = input.nextDouble();
            total += num;
        }

        return  total/7;
    }
}
