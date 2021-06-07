package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {

  List range(int start, int end) {
    return IntStream.rangeClosed(start, end)
        .boxed().collect(Collectors.toList());
  }

  @Test
  void getCategoryByDiscount_categoryOneAgeRangeFiveToFourteen_thirtyFiveDiscount() {
    List<Integer> ages = new ArrayList<>(range(5, 14));
    Theater test = new Theater(ages);

    Map<String, Double> expected = new HashMap<>();
    expected.put("Ages 5-14", 70d);
    expected.put("Ages 15-19", 0d);
    expected.put("Ages 20-45", 0d);
    expected.put("Ages 46-65", 0d);
    expected.put("Ages 66 and more", 0d);

    assertEquals(expected, test.getCategoryByDiscount());
  }

  @Test
  void getCategoryByDiscount_categoryTwoAgeRangeFifteenToNineteen_twentyFiveDiscount() {
    List<Integer> ages = new ArrayList<>(range(15, 19));
    Theater test = new Theater(ages);

    Map<String, Double> expected = new HashMap<>();
    expected.put("Ages 5-14", 0d);
    expected.put("Ages 15-19", 25d);
    expected.put("Ages 20-45", 0d);
    expected.put("Ages 46-65", 0d);
    expected.put("Ages 66 and more", 0d);

    assertEquals(expected, test.getCategoryByDiscount());
  }

  @Test
  void getCategoryByDiscount_categoryThreeAgeRangeTwentyToFortyFive_tenDiscount() {
    List<Integer> ages = new ArrayList<>(range(20, 45));
    Theater test = new Theater(ages);

    Map<String, Double> expected = new HashMap<>();
    expected.put("Ages 5-14", 0d);
    expected.put("Ages 15-19", 0d);
    expected.put("Ages 20-45", 52d);
    expected.put("Ages 46-65", 0d);
    expected.put("Ages 66 and more", 0d);

    assertEquals(expected, test.getCategoryByDiscount());
  }

  @Test
  void getCategoryByDiscount_categoryFourAgeRangeFortySixToSixtyFive_twentyFiveDiscount() {
    List<Integer> ages = new ArrayList<>(range(46, 65));
    Theater test = new Theater(ages);

    Map<String, Double> expected = new HashMap<>();
    expected.put("Ages 5-14", 0d);
    expected.put("Ages 15-19", 0d);
    expected.put("Ages 20-45", 0d);
    expected.put("Ages 46-65", 100d);
    expected.put("Ages 66 and more", 0d);

    assertEquals(expected, test.getCategoryByDiscount());
  }

  @Test
  void getCategoryByDiscount_categoryFiveAgeGreaterThanSixty_thirtyFiveDiscount() {
    List<Integer> ages = new ArrayList<>(range(66, 70));
    Theater test = new Theater(ages);

    Map<String, Double> expected = new HashMap<>();
    expected.put("Ages 5-14", 0d);
    expected.put("Ages 15-19", 0d);
    expected.put("Ages 20-45", 0d);
    expected.put("Ages 46-65", 0d);
    expected.put("Ages 66 and more", 35d);

    assertEquals(expected, test.getCategoryByDiscount());
  }

  @Test
  void getCategoryByDiscount_NoCategoryLessThanFive_NoDiscount() {
    List<Integer> ages = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
    Theater test = new Theater(ages);

    Map<String, Double> expected = new HashMap<>();
    expected.put("Ages 5-14", 0d);
    expected.put("Ages 15-19", 0d);
    expected.put("Ages 20-45", 0d);
    expected.put("Ages 46-65", 0d);
    expected.put("Ages 66 and more", 0d);

    assertEquals(expected, test.getCategoryByDiscount());
  }

  @Test
  void getCategoryByDiscount_allCategories() {
    List<Integer> ages = new ArrayList<>(Arrays.asList(5, 14, 15, 19, 20, 45, 46, 65, 66, 99));
    Theater test = new Theater(ages);

    Map<String, Double> expected = new HashMap<>();
    expected.put("Ages 5-14", 14d);
    expected.put("Ages 15-19", 10d);
    expected.put("Ages 20-45", 4d);
    expected.put("Ages 46-65", 10d);
    expected.put("Ages 66 and more", 14d);

    assertEquals(expected, test.getCategoryByDiscount());
  }
}
