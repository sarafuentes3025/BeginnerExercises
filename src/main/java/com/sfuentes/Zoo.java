package com.sfuentes;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

  public Map<String, Integer> calculatePercentage(int[] animalAges) {

    Map<String, Integer> map = new HashMap<>();

    double betweenZeroAndOneCount = 0;
    double lessThanThreeCount = 0;
    double greaterThanOrEqualToThreeCount = 0;

    for (int ageAnimal : animalAges) {
      if (ageAnimal <= 1) {
        betweenZeroAndOneCount++;
      } else if (ageAnimal < 3) {
        lessThanThreeCount++;
      } else {
        greaterThanOrEqualToThreeCount++;
      }
    }

    map.put("1.Category 0-1: ", (int) Math.round((betweenZeroAndOneCount / animalAges.length) * 100));
    map.put("2.Category 1-3: ", (int) Math.round((lessThanThreeCount / animalAges.length) * 100));
    map.put("3.Category 3 or more: ", (int) Math.round((greaterThanOrEqualToThreeCount / animalAges.length) * 100));

    return map;
  }

}
