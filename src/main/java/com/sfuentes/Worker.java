package com.sfuentes;

public class Worker {

  int workerId;
  int hours;

  public Worker(int workerId, int hours) {
    this.workerId = workerId;
    this.hours = hours;
  }

  public double calculateSalary() {

    if (hours <= 40)
      return hours * 200;
    else
      return 8_000 + (hours - 40) * 250;

  }
}

