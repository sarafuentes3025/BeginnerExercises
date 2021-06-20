package com.sfuentes.elections;

public class Vote {

  private final String candidateName;

  public Vote(String vote) {
    this.candidateName = vote;
  }

  public String getCandidateName() {
    return candidateName;
  }
}
