package com.sfuentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClubMember {

  ArrayList<Double> weightPerScale;
  double previousWeight;

  public ClubMember(double previousWeight, ArrayList<Double> weightPerScale) {

    this.previousWeight = previousWeight;
    if (weightPerScale.size() == 10)
      this.weightPerScale = weightPerScale;
    else
      throw new IllegalArgumentException("Incorrect amount of weights");
  }

  public Map<String, Double> getWeightComparison() {
    Map<String, Double> comparison = new HashMap<>();
    double sum = 0.0;
    double average;

    for (double clave : weightPerScale) {
      sum += clave;
    }

    average = sum / weightPerScale.size();

    if (average > previousWeight)
      comparison.put("Gained weight", average - previousWeight);
    else if (average < previousWeight)
      comparison.put("Lose weight", previousWeight - average);
    else
      comparison.put("", 0d);

    return comparison;
  }

}
