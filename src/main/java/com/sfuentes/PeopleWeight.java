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


    for (double[] doubles : array) {
      if ((int) doubles[0] <= 12) {
        sumKids += doubles[1];
        countKids++;
      } else if ((int) doubles[0] <= 29) {
        sumTeens += doubles[1];
        countTeens++;
      } else if ((int) doubles[0] <= 59) {
        sumAdults += doubles[1];
        countAdults++;
      } else if ((int) doubles[0] >= 60) {
        sumSeniors += doubles[1];
        countSeniors++;
      }
    }

    categories.add("Kids 0 - 12 average weight: " + (countKids <= 0 ? 0 : sumKids / countKids));
    categories.add("Teens 13 - 29 average weight: " + (countTeens <= 0 ? 0 : sumTeens / countTeens));
    categories.add("Adults 30 - 59 average weight: " + (countAdults <= 0 ? 0 : sumAdults / countAdults));
    categories.add("Seniors 60 - ... average weight: " + (countSeniors <= 0 ? 0 : sumSeniors / countSeniors));

    return categories;
  }
}

