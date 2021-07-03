package com.sfuentes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Worker {

  public final int workerId;
  public final int hours;

  public double calculateSalary() {
    if (hours <= 40)
      return hours * 200;
    else
      return 8_000 + (hours - 40) * 250;
  }
}

