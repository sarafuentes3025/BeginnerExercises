package com.sfuentes;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class CarLicensePlate {
  public final String[] licensePlates;

  public Map<String, Integer> getLicenseCountByColor(String[] licensePlates) {

    Map<String, Integer> categories = new HashMap<>();

    int yellowCount = 0;
    int pinkCount = 0;
    int redCount = 0;
    int greenCount = 0;
    int blueCount = 0;

    for (String licensePlate : licensePlates) {

      String numberOnly = licensePlate.replaceAll("[^0-9]", "");
      int convertToInt = Integer.parseInt(numberOnly.substring(numberOnly.length() - 1));

      switch (convertToInt) {
        case 1, 2 -> yellowCount++;
        case 3, 4 -> pinkCount++;
        case 5, 6 -> redCount++;
        case 7, 8 -> greenCount++;
        case 9, 0 -> blueCount++;
      }
    }

    categories.put("1 or 2 - Yellow ", yellowCount);
    categories.put("3 or 4 - Pink ", pinkCount);
    categories.put("1 or 2 - Red ", redCount);
    categories.put("3 or 4 - Green ", greenCount);
    categories.put("3 or 4 - Blue ", blueCount);

    return categories;
  }
}
