package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleWeightTest {

  @Test
  void generateWeightAverage_sizeArray() {
    PeopleWeight categories = new PeopleWeight();
    double[][] agesWeight =
        {
            {60, 80.5},
            {29, 68.5},
            {59, 79.5},
            {12, 25.5}
        };

    assertEquals(categories.generateWeightAverage(agesWeight).size(),4);
  }

  @Test
  void generateWeightAverage_OnlyKids() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Kids 0 - 12 average weight: 27.5";
    double[][] agesWeights =
        {
            {9, 30.5},
            {5, 28.5},
            {0, 5.5},
            {12, 45.5}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);

    assertEquals(expectedResult,arrayLists.get(0));
  }

  @Test
  void generateWeightAverage_OnlyTeens() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Teens 13 - 29 average weight: 55.0";
    double[][] agesWeights =
        {
            {13, 50.5},
            {16, 68.5},
            {18, 55.5},
            {29, 45.5}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);

    assertEquals(expectedResult,arrayLists.get(1));
  }

  @Test
  void generateWeightAverage_OnlyAdults() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Adults 30 - 59 average weight: 60.5";
    double[][] agesWeights =
        {
            {30, 52.5},
            {40, 39.0},
            {50, 70.5},
            {59, 80.0}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);

    assertEquals(expectedResult,arrayLists.get(2));
  }

  @Test
  void generateWeightAverage_OnlyOldest() {
    PeopleWeight categories = new PeopleWeight();
    String expectedResult = "Seniors 60 - ... average weight: 78.25";
    double[][] agesWeights =
        {
            {80, 42.0},
            {90, 80.5},
            {77, 90.0},
            {100, 100.5}

        };
    ArrayList<String> arrayLists = categories.generateWeightAverage(agesWeights);

    assertEquals(expectedResult,arrayLists.get(3));
  }

}
