package com.sfuentes.elections;

import java.util.List;
import java.util.Map;

public class ElectionResults {

  String winner;
  int numVotes;

  public ElectionResults getWinningCandidate(List<Vote> votes) {
    ElectionResults results = new ElectionResults();
    GovernmentElections elections = new GovernmentElections(votes);

    for (Map.Entry<String, Integer> section : elections.countVotes().entrySet()) {
      if (section.getValue() > results.numVotes) {
        results.numVotes = section.getValue();
        results.winner = section.getKey();
      }
    }
    return results;
  }

  public String getWinner() {
    return winner;
  }

  public int getNumVotes() {
    return numVotes;
  }
}
