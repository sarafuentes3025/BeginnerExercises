package com.sfuentes.elections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

  private final List<Vote> votes;

  public Result(List<Vote> votes) {
    this.votes = votes;
  }

  private Map<String, Integer> countVotes() {
    int firstCandidateCount = 0;
    int secondCandidateCount = 0;
    int thirdCandidateCount = 0;
    Map<String, Integer> candidates = new HashMap<>();
    for (Vote vote : votes) {

      switch (vote.getNameCandidate().toLowerCase()) {
        case "mauricio" -> firstCandidateCount++;
        case "joaquin" -> secondCandidateCount++;
        case "rodrigo" -> thirdCandidateCount++;
      }
    }
    candidates.put("Mauricio: ", firstCandidateCount);
    candidates.put("Joaquin: ", secondCandidateCount);
    candidates.put("Rodrigo: ", thirdCandidateCount);

    return candidates;
  }

  public Map<String, Integer> getWinningCandidate() {
    Map<String, Integer> total = new HashMap<>();
    int maxValue = 0;
    String maxKey = "";
    for (Map.Entry<String, Integer> section : countVotes().entrySet()) {
      if (section.getValue() > maxValue) {
        maxValue = section.getValue();
        maxKey = section.getKey();
      }
    }
    total.put(maxKey, maxValue);

    return total;
  }
}



