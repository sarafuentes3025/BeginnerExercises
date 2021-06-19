package com.sfuentes;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GubernatorialElectionsTest {

  @Test
  void getNumberOfVotesPerGovernor_allCandidates_sameNumberOfVotes() {
    List<String> votes = List.of("mauricio", "mauricio", "joaquin", "rodrigo", "joaquin", "mauricio", "joaquin", "rodrigo", "rodrigo");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);
    expected.put("Rodrigo: ", 3);
    expected.put("Joaquin: ", 3);

    assertEquals(expected, test.getNumberOfVotesPerGovernor());
  }

  @Test
  void getNumberOfVotesPerGovernor_onlyMauricioCandidate() {
    List<String> votes = List.of("mauricio", "mauricio", "mauricio");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);
    expected.put("Rodrigo: ", 0);
    expected.put("Joaquin: ", 0);
    assertEquals(expected, test.getNumberOfVotesPerGovernor());
  }

  @Test
  void getNumberOfVotesPerGovernor_onlyJoaquinCandidate() {
    List<String> votes = List.of("joaquin", "joaquin", "joaquin");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 0);
    expected.put("Joaquin: ", 3);
    expected.put("Rodrigo: ", 0);
    assertEquals(expected, test.getNumberOfVotesPerGovernor());
  }

  @Test
  void getNumberOfVotesPerGovernor_onlyRodrigoCandidate() {
    List<String> votes = List.of("rodrigo", "rodrigo", "rodrigo");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 0);
    expected.put("Joaquin: ", 0);
    expected.put("Rodrigo: ", 3);
    assertEquals(expected, test.getNumberOfVotesPerGovernor());
  }

  @Test
  void getNumberOfVotesPerGovernor_upperCase_onlyRodrigoCandidate() {
    List<String> votes = List.of("RODRIGO", "RODRIGO", "RODRIGO");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 0);
    expected.put("Joaquin: ", 0);
    expected.put("Rodrigo: ", 3);
    assertEquals(expected, test.getNumberOfVotesPerGovernor());
  }

  @Test
  void getNumberOfVotesPerGovernor_noCandidate() {
    List<String> votes = List.of();

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 0);
    expected.put("Joaquin: ", 0);
    expected.put("Rodrigo: ", 0);
    assertEquals(expected, test.getNumberOfVotesPerGovernor());
  }


  @Test
  void getWinningCandidate_onlyRodrigoCandidate() {
    List<String> votes = List.of("rodrigo", "rodrigo", "rodrigo", "rodrigo");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Rodrigo: ", 4);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyJoaquinCandidate() {
    List<String> votes = List.of("joaquin", "joaquin", "joaquin", "joaquin");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Joaquin: ", 4);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyMauricioCandidate() {
    List<String> votes = List.of("mauricio", "mauricio", "mauricio", "mauricio");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 4);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_rodrigoIsTheWinner() {
    List<String> votes = List.of("mauricio", "rodrigo", "rodrigo", "joaquin");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Rodrigo: ", 2);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_mauricioIsTheWinner() {
    List<String> votes = List.of("mauricio", "mauricio", "mauricio", "rodrigo", "joaquin");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_joaquinIsTheWinner() {
    List<String> votes = List.of("joaquin", "joaquin", "joaquin", "rodrigo", "mauricio");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Joaquin: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_sameIsTheWinner() {
    List<String> votes = List.of("joaquin", "joaquin", "rodrigo", "mauricio", "rodrigo", "joaquin", "rodrigo", "mauricio", "mauricio");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_UpperCase_sameIsTheWinner() {
    List<String> votes = List.of("JOAQUIN", "JOAQUIN", "RODRIGO", "MAURICIO", "RODRIGO", "JOAQUIN", "RODRIGO", "MAURICIO", "MAURICIO");

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_noCandidates_noWinner() {
    List<String> votes = List.of();

    GovernmentElections test = new GovernmentElections(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("", 0);

    assertEquals(expected, test.getWinningCandidate());
  }
}
