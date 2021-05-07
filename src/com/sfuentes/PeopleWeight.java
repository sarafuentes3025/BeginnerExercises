package com.sfuentes;

import java.util.ArrayList;

public class PeopleWeight {

  public ArrayList<String> generateWeightAverage(double[][] array) {
    ArrayList<String> categories = new ArrayList<>();
    double sumKids = 0;
    double sumTeens = 0;
    double sumAdults = 0;
    double sumSeniors = 0;
    int countKids = 0;
    int countTeens = 0;
    int countAdults = 0;
    int countSeniors = 0;
    double averageKids = 0;
    double averageTeens = 0;
    double averageAdults = 0;
    double averageSeniors = 0;


    for (int i = 0; i < array.length; i++) {
      if ((int) array[i][0] <= 12) {
        sumKids += array[i][1];
        countKids++;
      } else if ((int) array[i][0] <= 29) {
        sumTeens += array[i][1];
        countTeens++;
      } else if ((int) array[i][0] <= 59) {
        sumAdults += array[i][1];
        countAdults++;
      } else if ((int) array[i][0] >= 60) {
        sumSeniors += array[i][1];
        countSeniors++;
      }
    }

    averageKids = countKids <= 0 ? 0 : sumKids / countKids;
    averageTeens = countTeens <= 0 ? 0 : sumTeens / countTeens;
    averageAdults = countAdults <= 0 ? 0 : sumAdults / countAdults;
    averageSeniors = countSeniors <= 0 ? 0 : sumSeniors / countSeniors;

    categories.add("Kids 0 - 12 average weight: " + averageKids);
    categories.add("Teens 13 - 29 average weight: " + averageTeens);
    categories.add("Adults 30 - 59 average weight: " + averageAdults);
    categories.add("Seniors 60 - ... average weight: " + averageSeniors);

    return categories;
  }
}

