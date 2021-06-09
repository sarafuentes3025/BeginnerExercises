package com.sfuentes.farm;

public class Hen {
  private double henWeight;
  private double henHeight;
  private int numberOfEggs;

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
