package com.sfuentes.elections;

import java.util.Objects;

public class ElectionResults {

  String winner;
  int numVotes;

  public ElectionResults(String winner, int numVotes) {
    this.winner = winner;
    this.numVotes = numVotes;
  }

  public String getWinner() {
    return winner;
  }

  public int getNumVotes() {
    return numVotes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ElectionResults)) return false;
    ElectionResults that = (ElectionResults) o;
    return getNumVotes() == that.getNumVotes() && Objects.equals(getWinner(), that.getWinner());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getWinner(), getNumVotes());
  }
}
