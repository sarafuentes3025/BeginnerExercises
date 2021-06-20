package com.sfuentes.electionsTest;

import com.sfuentes.elections.Result;
import com.sfuentes.elections.Vote;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {

  @Test
  void getWinningCandidate_allCandidates_rodrigoIsTheWinner() {
    Vote vote1 = new Vote("mauricio");
    Vote vote2 = new Vote("rodrigo");
    Vote vote3 = new Vote("rodrigo");
    Vote vote4 = new Vote("joaquin");
    List<Vote> votes = List.of(vote1, vote2, vote3, vote4);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Rodrigo: ", 2);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_mauricioIsTheWinner() {
    Vote vote1 = new Vote("mauricio");
    Vote vote2 = new Vote("mauricio");
    Vote vote3 = new Vote("mauricio");
    Vote vote4 = new Vote("joaquin");
    Vote vote5 = new Vote("rodrigo");
    List<Vote> votes = List.of(vote1, vote2, vote3, vote4, vote5);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_joaquinIsTheWinner() {
    Vote vote1 = new Vote("mauricio");
    Vote vote2 = new Vote("joaquin");
    Vote vote3 = new Vote("joaquin");
    Vote vote4 = new Vote("joaquin");
    Vote vote5 = new Vote("rodrigo");
    List<Vote> votes = List.of(vote1, vote2, vote3, vote4, vote5);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Joaquin: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_sameNumberOfVotes() {
    Vote vote1 = new Vote("mauricio");
    Vote vote2 = new Vote("mauricio");
    Vote vote3 = new Vote("mauricio");
    Vote vote4 = new Vote("joaquin");
    Vote vote5 = new Vote("joaquin");
    Vote vote6 = new Vote("joaquin");
    Vote vote7 = new Vote("rodrigo");
    Vote vote8 = new Vote("rodrigo");
    Vote vote9 = new Vote("rodrigo");
    List<Vote> votes = List.of(vote1, vote2, vote3, vote4, vote5, vote6, vote7, vote8, vote9);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyMauricioCandidate() {
    Vote vote1 = new Vote("mauricio");
    Vote vote2 = new Vote("mauricio");
    Vote vote3 = new Vote("mauricio");

    List<Vote> votes = List.of(vote1, vote2, vote3);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Mauricio: ", 3);
    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyJoaquinCandidate() {
    Vote vote1 = new Vote("joaquin");
    Vote vote2 = new Vote("joaquin");
    Vote vote3 = new Vote("joaquin");

    List<Vote> votes = List.of(vote1, vote2, vote3);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Joaquin: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyRodrigoCandidate() {
    Vote vote1 = new Vote("rodrigo");
    Vote vote2 = new Vote("rodrigo");
    Vote vote3 = new Vote("rodrigo");

    List<Vote> votes = List.of(vote1, vote2, vote3);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Rodrigo: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_upperCase_onlyRodrigoCandidate() {
    Vote vote1 = new Vote("RODRIGO");
    Vote vote2 = new Vote("RODRIGO");
    Vote vote3 = new Vote("RODRIGO");

    List<Vote> votes = List.of(vote1, vote2, vote3);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("Rodrigo: ", 3);

    assertEquals(expected, test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_noCandidates_noWinner() {
    Vote vote1 = new Vote("");

    List<Vote> votes = List.of(vote1);

    Result test = new Result(votes);

    Map<String, Integer> expected = new HashMap<>();
    expected.put("", 0);

    assertEquals(expected, test.getWinningCandidate());
  }
}
