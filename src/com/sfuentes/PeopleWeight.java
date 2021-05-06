package com.sfuentes;

import java.util.ArrayList;

public class PeopleWeight {

  public ArrayList<String> generateWeightAverage(double[][] array) {
    ArrayList<String> categories = new ArrayList<>();
    double sumKids = 0;
    double sumTeens = 0;
    double sumAdults = 0;
    double sumOldest = 0;
    int countKids = 0;
    int countTeens = 0;
    int countAdults = 0;
    int countOldsters = 0;
    double averageKids = 0;
    double averageTeens = 0;
    double averageAdults = 0;
    double averageOldest = 0;
    int j = 0;


    for (int i = 0; i < array.length; i++) {
      if ((int) array[i][0] <= 12) {
        sumKids += array[j][1];
        countKids++;
      } else if ((int) array[i][0] <= 29) {
        sumTeens += array[j][1];
        countTeens++;
      } else if ((int) array[i][0] <= 59) {
        sumAdults += array[j][1];
        countAdults++;
      } else if ((int) array[i][0] >= 60) {
        sumOldest += array[j][1];
        countOldsters++;
      }
      j++;
    }

    averageKids = countKids <= 0 ? 0 : sumKids / countKids;
    averageTeens = countTeens <= 0 ? 0 : sumTeens / countTeens;
    averageAdults = countAdults <= 0 ? 0 : sumAdults / countAdults;
    averageOldest = countOldsters <= 0 ? 0 : sumOldest / countOldsters;

    categories.add("Kids 0 - 12 average weight: " + averageKids);
    categories.add("Teens 13 - 29 average weight: " + averageTeens);
    categories.add("Adults 30 - 59 average weight: " + averageAdults);
    categories.add("Oldest 60 - ... average weight: " + averageOldest);

    return categories;
  }
}

