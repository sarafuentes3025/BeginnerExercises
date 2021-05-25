package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClubMemberTest {

  @Test
  void weightPerScale_InvalidWeight_ExceptionThrown() {
    ArrayList<Double> weightPerScale = new ArrayList<>(Arrays.asList(80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d));

    Exception exception = assertThrows(IllegalArgumentException.class, () -> new ClubMember(90, weightPerScale));

    assertEquals(exception.getMessage(), "Incorrect amount of weights");
  }

  @Test
  void weightPerScale_gainedWeight() {
    ArrayList<Double> weightPerScale = new ArrayList<>(Arrays.asList(80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d));
    ClubMember test = new ClubMember(70, weightPerScale);
    Map<String, Double> expected = new HashMap<>();
    expected.put("Gained weight", 10d);

    assertEquals(expected, test.getWeightComparison());
  }

  @Test
  void weightPerScale_lostWeight() {
    ArrayList<Double> weightPerScale = new ArrayList<>(Arrays.asList(90d, 80d, 90d, 80d, 90d, 80d, 90d, 80d, 90d, 80d));
    ClubMember test = new ClubMember(100, weightPerScale);
    Map<String, Double> expected = new HashMap<>();
    expected.put("Lose weight", 15d);

    assertEquals(expected, test.getWeightComparison());
  }

  @Test
  void weightPerScale_NoPreviousWeight() {
    ArrayList<Double> weightPerScale = new ArrayList<>(Arrays.asList(0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d, 0d));
    ClubMember test = new ClubMember(0, weightPerScale);
    Map<String, Double> expected = new HashMap<>();
    expected.put("", 0d);

    assertEquals(expected, test.getWeightComparison());
  }

}
