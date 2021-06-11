package com.sfuentes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Voting {

  List<String> votes;

  public Voting(List<String> votes) {
    this.votes = votes;
  }


  public Map<String, Integer> getNumberOfVotesPerSection() {
    int northCount = 0;
    int southCount = 0;
    int centerCount = 0;
    Map<String, Integer> sections = new HashMap<>();
    for (String vote : votes) {

      switch (vote.toLowerCase()) {
        case "north" -> northCount++;
        case "south" -> southCount++;
        case "center" -> centerCount++;
      }
    }
    sections.put("North: ", northCount);
    sections.put("South: ", southCount);
    sections.put("Center: ", centerCount);

    return sections;
  }

  public Map<String, Integer> getMax() {
    Map<String, Integer> total = new HashMap<>();
    int maxValue = 0;
    String maxKey = "";
    for (Map.Entry<String, Integer> section : getNumberOfVotesPerSection().entrySet()) {
      if (section.getValue() > maxValue) {
        maxValue = section.getValue();
        maxKey = section.getKey();
      }
    }

    total.put(maxKey, maxValue);

    return total;
  }

}
