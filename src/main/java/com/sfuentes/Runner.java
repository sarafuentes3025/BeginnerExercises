package com.sfuentes;

public class Runner {

  public boolean calculateIfItIsSuitable(double[] laps) {
    boolean suitable = false;
    double sum = 0;
    int lessThanSixteen = 0;
    for (double lap : laps) {
      if (lap < 16.0)
        lessThanSixteen++;
      sum += lap;
    }

    double average = sum / laps.length;

    if (lessThanSixteen >= 9 || average <= 15.0)
      suitable = true;

    return suitable;
  }
}
