package com.sfuentes;

import java.util.ArrayList;

public class NegativeToPositive {
  public ArrayList<Double> convertNegativeToPositive(double[] numbers) {

    ArrayList<Double> positives = new ArrayList<>();
    for (double number : numbers) {
      if (number < 0)
        number = number * -1;
      positives.add(number);
    }
    return positives;
  }
}
