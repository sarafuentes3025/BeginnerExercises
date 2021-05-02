package com.sfuentes;

import java.util.ArrayList;

public class DigitalClock {

  public static ArrayList<String> generateHours() {
    ArrayList<String> time = new ArrayList<>();

    for (int hour = 0; hour < 24; hour++) {
      for (int minute = 0; minute < 60; minute++) {
        for (int second = 0; second < 60; second++) {
          time.add(hour + ":" + minute + ":" + second);
        }
      }
    }
    return time;
  }
}

