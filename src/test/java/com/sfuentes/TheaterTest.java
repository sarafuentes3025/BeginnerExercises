package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {

  @Test
  void getSubtractionByDiscount_categoryOneAgeRangeFiveToFourteen_thirtyFiveDiscount() {
    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
    Theater test = new Theater(ages);

    assertEquals(70d, test.getSubtractionByDiscount());
  }

  @Test
  void getSubtractionByDiscount_categoryTwoAgeRangeFifteenToNineteen_twentyFiveDiscount() {
    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(15, 16, 17, 18, 19));
    Theater test = new Theater(ages);

    assertEquals(25d, test.getSubtractionByDiscount());
  }

  @Test
  void getSubtractionByDiscount_categoryThreeAgeRangeTwentyToFortyFive_tenDiscount() {
    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 42, 43, 44, 45));
    Theater test = new Theater(ages);

    assertEquals(50d, test.getSubtractionByDiscount());
  }

  @Test
  void getSubtractionByDiscount_categoryFourAgeRangeFortySixToSixtyFive_twentyFiveDiscount() {
    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 62, 63, 64, 65));
    Theater test = new Theater(ages);

    assertEquals(95d, test.getSubtractionByDiscount());
  }

  @Test
  void getSubtractionByDiscount_categoryFiveAgeGreaterThanSixty_thirtyFiveDiscount() {
    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(66, 67, 68, 69, 70));
    Theater test = new Theater(ages);

    assertEquals(35d, test.getSubtractionByDiscount());
  }

  @Test
  void getSubtractionByDiscount_NoCategoryLessThanFive_NoDiscount() {
    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
    Theater test = new Theater(ages);

    assertEquals(0d, test.getSubtractionByDiscount());
  }

  @Test
  void getSubtractionByDiscount_allCategories() {
    ArrayList<Integer> ages = new ArrayList<>(Arrays.asList(5, 14, 15, 19, 20, 45, 46, 65, 66, 99));
    Theater test = new Theater(ages);

    assertEquals(52d, test.getSubtractionByDiscount());
  }
}
