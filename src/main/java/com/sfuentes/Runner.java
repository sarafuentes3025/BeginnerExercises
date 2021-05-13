package com.sfuentes;

public class Runner {

  public boolean calculateIfItIsSuitable(double[] laps) {
    boolean suitable;
    double sum = 0;
    int lessThanSixteen = 0;
    int overSixteen = 0;
    for (double lap : laps) {
      if (lap < 16.0)
        lessThanSixteen++;
      else
        overSixteen++;
      sum += lap;
    }

    double average = sum / laps.length;

    if (lessThanSixteen == 10 || overSixteen == 1)
      suitable = true;
    else
      suitable = average <= 15.0;

    return suitable;
  }
}
