package com.sfuentes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GovernmentElections {

  List<String> votes;

  public GovernmentElections(List<String> votes){
    this.votes = votes;
  }

  public Map<String, Integer> getNumberOfVotesPerGovernor() {
    int firstCandidateCount = 0;
    int secondCandidateCount = 0;
    int thirdCandidateCount = 0;
    Map<String, Integer> governors = new HashMap<>();
    for (String vote : votes) {

      switch (vote.toLowerCase()) {
        case "mauricio" -> firstCandidateCount++;
        case "joaquin" -> secondCandidateCount++;
        case "rodrigo" -> thirdCandidateCount++;
      }
    }
    governors.put("Mauricio: ", firstCandidateCount);
    governors.put("Joaquin: ", secondCandidateCount);
    governors.put("Rodrigo: ", thirdCandidateCount);

    return governors;
  }

  public Map<String, Integer> getWinningCandidate() {
    Map<String, Integer> total = new HashMap<>();
    int maxValue = 0;
    String maxKey = "";
    for (Map.Entry<String, Integer> section : getNumberOfVotesPerGovernor().entrySet()) {
      if (section.getValue() > maxValue) {
        maxValue = section.getValue();
        maxKey = section.getKey();
      }
    }

    total.put(maxKey, maxValue);

    return total;
  }

}
