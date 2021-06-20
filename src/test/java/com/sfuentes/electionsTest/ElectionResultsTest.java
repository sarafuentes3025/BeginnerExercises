package com.sfuentes.electionsTest;

import com.sfuentes.elections.ElectionResults;
import com.sfuentes.elections.Vote;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ElectionResultsTest {

  @Test
  void getWinningCandidate_allCandidates_rodrigoIsTheWinner() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("rodrigo"), new Vote("rodrigo"), new Vote("joaquin"));

    ElectionResults test = new ElectionResults();

    assertEquals("Rodrigo", test.getWinningCandidate(votes).getWinner());
    assertEquals(2, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_allCandidates_mauricioIsTheWinner() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("mauricio"), new Vote("mauricio"), new Vote("joaquin"), new Vote("rodrigo"));

    ElectionResults test = new ElectionResults();

    assertEquals("Mauricio", test.getWinningCandidate(votes).getWinner());
    assertEquals(3, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_allCandidates_joaquinIsTheWinner() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("joaquin"), new Vote("joaquin"), new Vote("joaquin"), new Vote("rodrigo"));

    ElectionResults test = new ElectionResults();

    assertEquals("Joaquin", test.getWinningCandidate(votes).getWinner());
    assertEquals(3, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_allCandidates_sameNumberOfVotes() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("mauricio"), new Vote("mauricio"), new Vote("joaquin"), new Vote("joaquin"), new Vote("joaquin"), new Vote("rodrigo"), new Vote("rodrigo"), new Vote("rodrigo"));

    ElectionResults test = new ElectionResults();

    assertEquals("Mauricio", test.getWinningCandidate(votes).getWinner());
    assertEquals(3, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_onlyMauricioCandidate() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("mauricio"), new Vote("mauricio"));

    ElectionResults test = new ElectionResults();

    assertEquals("Mauricio", test.getWinningCandidate(votes).getWinner());
    assertEquals(3, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_onlyJoaquinCandidate() {
    List<Vote> votes = List.of(new Vote("joaquin"), new Vote("joaquin"), new Vote("joaquin"));

    ElectionResults test = new ElectionResults();

    assertEquals("Joaquin", test.getWinningCandidate(votes).getWinner());
    assertEquals(3, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_onlyRodrigoCandidate() {
    List<Vote> votes = List.of(new Vote("rodrigo"), new Vote("rodrigo"), new Vote("rodrigo"));

    ElectionResults test = new ElectionResults();

    assertEquals("Rodrigo", test.getWinningCandidate(votes).getWinner());
    assertEquals(3, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_upperCase_onlyRodrigoCandidate() {
    List<Vote> votes = List.of(new Vote("RODRIGO"), new Vote("RODRIGO"), new Vote("RODRIGO"));

    ElectionResults test = new ElectionResults();

    assertEquals("Rodrigo", test.getWinningCandidate(votes).getWinner());
    assertEquals(3, test.getWinningCandidate(votes).getNumVotes());
  }

  @Test
  void getWinningCandidate_noCandidates_noWinner() {
    List<Vote> votes = List.of(new Vote(""));

    ElectionResults test = new ElectionResults();

    assertNull(test.getWinningCandidate(votes).getWinner());
    assertEquals(0, test.getWinningCandidate(votes).getNumVotes());
  }
}
