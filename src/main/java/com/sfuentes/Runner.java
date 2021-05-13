package com.sfuentes;

public class Runner {

  public boolean calculateIfItIsSuitable(double[] minutes) {
    boolean suitable;
    double sum = 0;
    int conditionOne = 0;
    int conditionTwo = 0;
    for (double minute : minutes) {
      if (minute < 16.0) {
        conditionOne++;
        sum += minute;
      } else if (minute > 16.0) {
        conditionTwo++;
        sum += minute;
      } else
        sum += minute;
    }
    double average = sum / minutes.length;

    if (conditionOne == 10)
      suitable = true;
    else if (conditionTwo == 1)
      suitable = true;
    else
      suitable = average <= 15.0;

    return suitable;
  }
}
