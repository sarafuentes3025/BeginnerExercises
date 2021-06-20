package com.sfuentes.electionsTest;

import com.sfuentes.elections.ElectionResults;
import com.sfuentes.elections.GovernmentElections;
import com.sfuentes.elections.Vote;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ElectionResultsTest {

  @Test
  void getVotesComparison_emptyList_ExceptionThrown() {
    List<Vote> votes = List.of();

    Exception exception = assertThrows(IllegalArgumentException.class, () -> new GovernmentElections(votes));

    assertEquals(exception.getMessage(), "Error, the list is empty");
  }

  @Test
  void getWinningCandidate_allCandidates_rodrigoIsTheWinner() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("rodrigo"), new Vote("rodrigo"), new Vote("joaquin"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Rodrigo", 2), test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_mauricioIsTheWinner() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("mauricio"), new Vote("mauricio"), new Vote("joaquin"), new Vote("rodrigo"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Mauricio", 3), test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_joaquinIsTheWinner() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("joaquin"), new Vote("joaquin"), new Vote("joaquin"), new Vote("rodrigo"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Joaquin", 3), test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_allCandidates_sameNumberOfVotes() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("mauricio"), new Vote("mauricio"), new Vote("joaquin"), new Vote("joaquin"), new Vote("joaquin"), new Vote("rodrigo"), new Vote("rodrigo"), new Vote("rodrigo"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Mauricio", 3), test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyMauricioCandidate() {
    List<Vote> votes = List.of(new Vote("mauricio"), new Vote("mauricio"), new Vote("mauricio"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Mauricio", 3), test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyJoaquinCandidate() {
    List<Vote> votes = List.of(new Vote("joaquin"), new Vote("joaquin"), new Vote("joaquin"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Joaquin", 3), test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_onlyRodrigoCandidate() {
    List<Vote> votes = List.of(new Vote("rodrigo"), new Vote("rodrigo"), new Vote("rodrigo"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Rodrigo", 3), test.getWinningCandidate());
  }

  @Test
  void getWinningCandidate_upperCase_onlyRodrigoCandidate() {
    List<Vote> votes = List.of(new Vote("RODRIGO"), new Vote("RODRIGO"), new Vote("RODRIGO"));

    GovernmentElections test = new GovernmentElections(votes);

    assertEquals(new ElectionResults("Rodrigo", 3), test.getWinningCandidate());
  }
}
