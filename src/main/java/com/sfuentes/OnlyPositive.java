package com.sfuentes;

import java.util.ArrayList;

public class OnlyPositive {
  public ArrayList<Double> filterPositiveNumbers(double[] numbers) {

    ArrayList<Double> positives = new ArrayList<>();
    int i = 0;

    for (double number : numbers)
      if (number > 0)
        positives.add(number);
    return positives;
  }
}

