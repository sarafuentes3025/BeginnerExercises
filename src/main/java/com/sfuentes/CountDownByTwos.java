package com.sfuentes;

public class CountDownByTwos {

  int start;

  public CountDownByTwos(int start) {
    this.start = start;
  }

  public int calculateCountDownByTwos() {
    int count = 0;
    for (int i = start; i > 0; i -= 2)
      count += i;
    return count;
  }
}
