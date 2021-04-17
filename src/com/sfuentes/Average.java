package com.sfuentes;

import java.util.Scanner;

public class Average {
    public double calculateAverageStudent (){
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