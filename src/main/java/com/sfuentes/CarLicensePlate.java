package com.sfuentes;

import java.util.HashMap;
import java.util.Map;

public class CarLicensePlate {
  String[] licensePlates;

  public CarLicensePlate(String[] licensePlates) {
    this.licensePlates = licensePlates;
  }

  public Map<String, Integer> getCountOfEachColorByLicensePlate(String[] licensePlates) {

    Map<String, Integer> categories = new HashMap<>();

    int yellowCount = 0;
    int pinkCount = 0;
    int redCount = 0;
    int greenCount = 0;
    int blueCount = 0;

    for (String licensePlate : licensePlates) {

      String numberOnly = licensePlate.replaceAll("[^0-9]", "");
      int convertToInt = Integer.parseInt(numberOnly.substring(numberOnly.length() - 1));

      if (convertToInt == 1 || convertToInt == 2)
        yellowCount++;
      else if (convertToInt == 3 || convertToInt == 4)
        pinkCount++;
      else if (convertToInt == 5 || convertToInt == 6)
        redCount++;
      else if (convertToInt == 7 || convertToInt == 8)
        greenCount++;
      else
        blueCount++;
    }

    categories.put("1 or 2 - Yellow ", yellowCount);
    categories.put("3 or 4 - Pink ", pinkCount);
    categories.put("1 or 2 - Red ", redCount);
    categories.put("3 or 4 - Green ", greenCount);
    categories.put("3 or 4 - Blue ", blueCount);

    return categories;
  }
}
