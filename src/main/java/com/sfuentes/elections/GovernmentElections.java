package com.sfuentes.elections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GovernmentElections {

  private final List<Vote> votes;

  public GovernmentElections(List<Vote> votes) {
    this.votes = votes;
  }

  public Map<String, Integer> countVotes() {
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
}



