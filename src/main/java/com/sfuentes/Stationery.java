package com.sfuentes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stationery {

  Map<String, Integer> requested;

  public Stationery() {
    this.requested = new HashMap<>();
  }

  public void addRequest(String typeOfPrinting, int numOfCopies) {
    if (requested.containsKey(typeOfPrinting))
      requested.put(typeOfPrinting, requested.get(typeOfPrinting) + numOfCopies);
    else
      requested.put(typeOfPrinting, numOfCopies);
  }


  public List<String> verifyRequest() {

    Map<String, Integer> lowerCaseMap = requested.entrySet()
        .parallelStream()
        .collect(Collectors
            .toMap(entry -> entry.getKey()
                .toLowerCase(), Map.Entry::getValue));

    List<String> message = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : lowerCaseMap.entrySet())
      if (entry.getKey().equals("offset") && entry.getValue() <= 10_000)
        message.add("Accepted Offset");
      else if (entry.getKey().equals("standard") && entry.getValue() <= 50_000)
        message.add("Accepted Standard");
      else if (entry.getKey().equals("offset"))
        message.add("Rejected Offset");
      else if (entry.getKey().equals("standard"))
        message.add("Rejected Standard");
      else
        message.add("Incorrect values");

    return message;
  }
}


