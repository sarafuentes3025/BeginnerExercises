package com.sfuentes.elections;

import java.util.List;
import java.util.Map;

public class ElectionResults {

  String winner = "";
  int numVotes;

  public String getWinningCandidate(List<Vote> votes) {
    GovernmentElections elections = new GovernmentElections(votes);

    for (Map.Entry<String, Integer> section : elections.countVotes().entrySet()) {
      if (section.getValue() > numVotes) {
        numVotes = section.getValue();
        winner = section.getKey();
      }
    }
    return winner;
  }

  public int getNumVotesCandidate(List<Vote> votes) {
    GovernmentElections elections = new GovernmentElections(votes);

    for (Map.Entry<String, Integer> section : elections.countVotes().entrySet()) {
      if (section.getValue() > numVotes) {
        numVotes = section.getValue();
        winner = section.getKey();
      }
    }
    return numVotes;
  }
}
