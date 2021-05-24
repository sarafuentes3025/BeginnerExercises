package com.sfuentes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClubMember {
  int memberID;
  Map<Integer, List<Double>> weightPerScale;
  double previousWeight;

  public ClubMember(int memberID, double previousWeight, Map<Integer, List<Double>> weightPerScale) {

    this.memberID = memberID;
    this.previousWeight = previousWeight;
    this.weightPerScale = weightPerScale;
  }

  public Map<String, Double> getWeightComparison(double previousWeight, Map<Integer, List<Double>> weightPerScale) {
    Map<String, Double> comparison = new HashMap<>();
    double sum = 0.0;
    double average;

    for (double clave : weightPerScale.get(1)) {
      sum += clave;
    }

    average = sum / weightPerScale.get(1).size();

    if (average > previousWeight)
      comparison.put("Gained weight", average - previousWeight);
    else if (average < previousWeight)
      comparison.put("Under weight", previousWeight - average);
    else
      comparison.put("", 0d);

    return comparison;
  }

}
