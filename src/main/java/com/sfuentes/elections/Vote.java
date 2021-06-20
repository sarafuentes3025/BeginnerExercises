package com.sfuentes.elections;

public class Vote {

  private final String nameCandidate;

  public Vote(String vote) {
    this.nameCandidate = vote;
  }

  public String getNameCandidate() {
    return nameCandidate;
  }
}
