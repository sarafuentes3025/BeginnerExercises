package com.sfuentes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {
  @Test
  void calculatePercentage_allCategoriesElephants() {
    Zoo test = new Zoo();
    int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 10%, 2.Category 1-3: 5%, 3.Category 3 or more: 85%";

    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_betweenZeroAndOneElephants() {
    Zoo test = new Zoo();
    int[] ages = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 100%, 2.Category 1-3: 0%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_lessThanThreeElephants() {
    Zoo test = new Zoo();
    int[] ages = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 0%, 2.Category 1-3: 100%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_greaterThanOrEqualToThreeElephants() {
    Zoo test = new Zoo();
    int[] ages = {3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 0%, 2.Category 1-3: 0%, 3.Category 3 or more: 100%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_zeroElephants() {
    Zoo test = new Zoo();
    int[] ages = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 100%, 2.Category 1-3: 0%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_allCategoriesGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 13%, 2.Category 1-3: 7%, 3.Category 3 or more: 80%";

    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_betweenZeroAndOneGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 100%, 2.Category 1-3: 0%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_lessThanThreeGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 0%, 2.Category 1-3: 100%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_greaterThanOrEqualToThreeGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 0%, 2.Category 1-3: 0%, 3.Category 3 or more: 100%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_zeroGiraffe() {
    Zoo test = new Zoo();
    int[] ages = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 100%, 2.Category 1-3: 0%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_allCategoriesChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 10%, 2.Category 1-3: 5%, 3.Category 3 or more: 85%";

    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_betweenZeroAndOneChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 100%, 2.Category 1-3: 0%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_lessThanThreeChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 0%, 2.Category 1-3: 100%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_greaterThanOrEqualToThreeChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4,3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4, 5, 3, 4};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 0%, 2.Category 1-3: 0%, 3.Category 3 or more: 100%";
    assertEquals(expected, actualResult);
  }

  @Test
  void calculatePercentage_zeroChimpanzee() {
    Zoo test = new Zoo();
    int[] ages = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    String actualResult = test.calculatePercentage(ages);
    String expected = "1.Category 0-1: 100%, 2.Category 1-3: 0%, 3.Category 3 or more: 0%";
    assertEquals(expected, actualResult);
  }

}
