package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VotingTest {

  @Test
  void getNumberOfVotesPerSection_allSections_sameNumberOfVotes() {
    List<String> votes = List.of("North", "North", "South", "Center", "South", "North", "South", "Center", "Center");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("North: ", 3);
    expected.put("South: ", 3);
    expected.put("Center: ", 3);
    assertEquals(expected, test.getNumberOfVotesPerSection());
  }

  @Test
  void getNumberOfVotesPerSection_onlyNorthSections() {
    List<String> votes = List.of("North", "North", "North");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("North: ", 3);
    expected.put("South: ", 0);
    expected.put("Center: ", 0);
    assertEquals(expected, test.getNumberOfVotesPerSection());
  }

  @Test
  void getNumberOfVotesPerSection_onlySouthSections() {
    List<String> votes = List.of("South", "South", "South");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("North: ", 0);
    expected.put("South: ", 3);
    expected.put("Center: ", 0);
    assertEquals(expected, test.getNumberOfVotesPerSection());
  }

  @Test
  void getNumberOfVotesPerSection_onlyCenterSections() {
    List<String> votes = List.of("Center", "Center", "Center");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("North: ", 0);
    expected.put("South: ", 0);
    expected.put("Center: ", 3);
    assertEquals(expected, test.getNumberOfVotesPerSection());
  }

  @Test
  void getNumberOfVotesPerSection_noSections() {
    List<String> votes = List.of();

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("North: ", 0);
    expected.put("South: ", 0);
    expected.put("Center: ", 0);
    assertEquals(expected, test.getNumberOfVotesPerSection());
  }

  @Test
  void getMax_onlyCenterValue_centerIsTheLargest() {
    List<String> votes = List.of("Center", "Center", "Center", "Center");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Center: ", 4);

    assertEquals(expected, test.getMax());
  }

  @Test
  void getMax_onlySouthValue_southIsTheLargest() {
    List<String> votes = List.of("south", "south", "south", "south");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("South: ", 4);

    assertEquals(expected, test.getMax());
  }

  @Test
  void getMax_onlyNorthValue_northIsTheLargest() {
    List<String> votes = List.of("North", "North", "North", "North");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("North: ", 4);

    assertEquals(expected, test.getMax());
  }


  @Test
  void getMax_allSection_centerIsTheLargest() {
    List<String> votes = List.of("North", "Center", "Center", "south");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Center: ", 2);

    assertEquals(expected, test.getMax());
  }

  @Test
  void getMax_allSection_northIsTheLargest() {
    List<String> votes = List.of("north", "North", "North", "Center", "south");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("North: ", 3);

    assertEquals(expected, test.getMax());
  }

  @Test
  void getMax_allSection_southIsTheLargest() {
    List<String> votes = List.of("south", "south", "south", "Center", "North");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("South: ", 3);

    assertEquals(expected, test.getMax());
  }

  @Test
  void getMax_allSection_sameIsTheLargest() {
    List<String> votes = List.of("North", "North", "South", "Center", "South", "North", "South", "Center", "Center");

    Voting test = new Voting(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Center: ", 3);

    assertEquals(expected, test.getMax());
  }
}
