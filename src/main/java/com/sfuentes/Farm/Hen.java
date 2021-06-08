package com.sfuentes.Farm;

public class Hen {
  double henWeight;
  double henHeight;
  int numberOfEggs;

  public Hen(double henWeight, double henHeight, int numberOfEggs) {
    this.henWeight = henWeight;
    this.henHeight = henHeight;
    this.numberOfEggs = numberOfEggs;
  }

  public double getHenWeight() {
    return henWeight;
  }

  public double getHenHeight() {
    return henHeight;
  }

  public int getNumberOfEggs() {
    return numberOfEggs;
  }
}
