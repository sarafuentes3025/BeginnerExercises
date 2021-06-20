package com.sfuentes.elections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GovernmentElections {

  private final List<Vote> votes;

  public GovernmentElections(List<Vote> votes) {
    this.votes = votes;
  }

  private Map<String, Integer> countVotes() {
    int firstCandidateCount = 0;
    int secondCandidateCount = 0;
    int thirdCandidateCount = 0;
    Map<String, Integer> candidates = new HashMap<>();
    for (Vote vote : votes) {

      switch (vote.getCandidateName().toLowerCase()) {
        case "mauricio" -> firstCandidateCount++;
        case "joaquin" -> secondCandidateCount++;
        case "rodrigo" -> thirdCandidateCount++;
      }
    }
    candidates.put("Mauricio", firstCandidateCount);
    candidates.put("Joaquin", secondCandidateCount);
    candidates.put("Rodrigo", thirdCandidateCount);

    return candidates;
  }

  public ElectionResults getWinningCandidate() {
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
}



