package com.sfuentes.farm;

public class Hen {
  private final double henWeight;
  private final double henHeight;
  private final int numberOfEggs;

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
