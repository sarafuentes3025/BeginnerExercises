package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {

  @Test
  void calculatePercentage_sumTotalPercentage() {
    Zoo test = new Zoo();
    int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("1.Category 0-1: ") + actualResult.get("2.Category 1-3: ") + actualResult.get("3.Category 3 or more: "));
  }

  @Test
  void calculatePercentage_allCategoriesElephants() {
    Zoo test = new Zoo();
    int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(10, actualResult.get("1.Category 0-1: "));
    assertEquals(5, actualResult.get("2.Category 1-3: "));
    assertEquals(85, actualResult.get("3.Category 3 or more: "));
  }

  @Test
  void calculatePercentage_betweenZeroAndOneElephants() {
    Zoo test = new Zoo();
    int[] ages = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("1.Category 0-1: "));
  }

  @Test
  void calculatePercentage_lessThanThreeElephants() {
    Zoo test = new Zoo();
    int[] ages = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("2.Category 1-3: "));
  }

  @Test
  void calculatePercentage_greaterThanOrEqualToThreeElephants() {
    Zoo test = new Zoo();
    int[] ages = {3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("3.Category 3 or more: "));
  }

  @Test
  void calculatePercentage_zeroElephants() {
    Zoo test = new Zoo();
    int[] ages = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("1.Category 0-1: "));
  }

  @Test
  void calculatePercentage_allCategoriesGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(13, actualResult.get("1.Category 0-1: "));
    assertEquals(7, actualResult.get("2.Category 1-3: "));
    assertEquals(80, actualResult.get("3.Category 3 or more: "));
  }

  @Test
  void calculatePercentage_betweenZeroAndOneGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("1.Category 0-1: "));

  }

  @Test
  void calculatePercentage_lessThanThreeGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("2.Category 1-3: "));
  }

  @Test
  void calculatePercentage_greaterThanOrEqualToThreeGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("3.Category 3 or more: "));
  }

  @Test
  void calculatePercentage_zeroGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("1.Category 0-1: "));
  }

  @Test
  void calculatePercentage_allCategoriesChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(10, actualResult.get("1.Category 0-1: "));
    assertEquals(5, actualResult.get("2.Category 1-3: "));
    assertEquals(85, actualResult.get("3.Category 3 or more: "));
  }

  @Test
  void calculatePercentage_betweenZeroAndOneChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("1.Category 0-1: "));
  }

  @Test
  void calculatePercentage_lessThanThreeChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("2.Category 1-3: "));
  }

  @Test
  void calculatePercentage_greaterThanOrEqualToThreeChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("3.Category 3 or more: "));
  }

  @Test
  void calculatePercentage_zeroChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    Map<String, Integer> actualResult = test.calculatePercentage(ages);

    assertEquals(100, actualResult.get("1.Category 0-1: "));
  }

}
