package com.sfuentes.stationeryShop;

import java.util.HashMap;
import java.util.Map;

public class StationeryShop {

  private final Map<String, Integer> requests;

  public StationeryShop() {
    this.requests = new HashMap<>();
  }

  public boolean verifyRequest(Request request) {
    int max_standard = 50_000;
    int max_offset = 10_000;

    int pendingCopies = requests.getOrDefault(request.getTypeOfPrinting(), 0);

    return switch (request.getTypeOfPrinting().toLowerCase()) {
      case "standard" -> (max_standard - pendingCopies) >= request.getNumOfCopies();
      case "offset" -> (max_offset - pendingCopies) >= request.getNumOfCopies();
      default -> false;
    };
  }

  public boolean addRequest(Request request) {
    if (verifyRequest(request)) {
      requests.merge(request.getTypeOfPrinting(), request.getNumOfCopies(), Integer::sum);
      return true;
    } else
      return false;
  }
}


