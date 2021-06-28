package com.sfuentes.elections;

import lombok.Builder;
import lombok.Getter;

import java.util.Objects;
@Getter
@Builder
public class ElectionResults {

  String winner;
  int numVotes;

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
