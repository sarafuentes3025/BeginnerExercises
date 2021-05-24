package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClubMemberTest {

  @Test
  void weightPerScale_gainedWeight() {
    Map<Integer, List<Double>> weightPerScale = new HashMap<>();
    weightPerScale.put(1, new ArrayList<>(Arrays.asList(80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d, 80d)));
    ClubMember test = new ClubMember(1, 70, weightPerScale);
    Map<String, Double> expected = new HashMap<>();
    expected.put("Gained weight", 10d);

    assertEquals(expected, test.getWeightComparison(70, weightPerScale));
  }

  @Test
  void weightPerScale_lostWeight() {
    Map<Integer, List<Double>> weightPerScale = new HashMap<>();
    weightPerScale.put(1, new ArrayList<>(Arrays.asList(90d, 80d, 90d, 80d, 90d, 80d, 90d, 80d, 90d, 80d)));
    ClubMember test = new ClubMember(1, 70, weightPerScale);
    Map<String, Double> expected = new HashMap<>();
    expected.put("Under weight", 15d);

    assertEquals(expected, test.getWeightComparison(100, weightPerScale));
  }

  @Test
  void weightPerScale_NoPreviousWeight() {
    Map<Integer, List<Double>> weightPerScale = new HashMap<>();
    weightPerScale.put(1, new ArrayList<>(Collections.emptyList()));
    ClubMember test = new ClubMember(1, 0, weightPerScale);
    Map<String, Double> expected = new HashMap<>();
    expected.put("", 0d);

    assertEquals(expected, test.getWeightComparison(0, weightPerScale));
  }

}
