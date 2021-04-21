package com.sfuentes;

import java.util.ArrayList;

public class OnlyPositive {
  public ArrayList<Double> showOnlyPositiveNumbers(double[] numbers) {

    ArrayList<Double> positive = new ArrayList<>();
    int i = 0;

    for (double number : numbers)
      if (number > 0) {
        positive.add(number);
      }
    return positive;
  }
}

