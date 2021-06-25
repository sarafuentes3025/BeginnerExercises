package com.sfuentes.stationeryShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StationeryShopTest {

  @Test
  void verifyRequest_standardRequests_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 1)));
  }

  @Test
  void verifyRequest_offsetRequests_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("offset", 1)));
  }

  @Test
  void verifyRequest_duplicateOffSetRequestsThatFit_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
  }

  @Test
  void verifyRequest_duplicateStandardRequestsThatFit_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 10_000)));
    assertTrue(test.addRequest(new Request("standard", 10_000)));
    assertTrue(test.addRequest(new Request("standard", 10_000)));
    assertTrue(test.addRequest(new Request("standard", 10_000)));
    assertTrue(test.addRequest(new Request("standard", 10_000)));
  }

  @Test
  void verifyRequest_differentOffSetRequestsThatFit_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("offset", 9_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
  }

  @Test
  void verifyRequest_differentStandardRequestsThatFit_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 48_000)));
    assertTrue(test.addRequest(new Request("standard", 2_000)));
  }

  @Test
  void verifyRequest_multipleStandardAndOffsetRequestsThatFit_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 20_000)));
    assertTrue(test.addRequest(new Request("standard", 10_000)));
    assertTrue(test.addRequest(new Request("standard", 20_000)));
    assertTrue(test.addRequest(new Request("offset", 1_000)));
    assertTrue(test.addRequest(new Request("offset", 2_000)));
    assertTrue(test.addRequest(new Request("offset", 3_000)));
    assertTrue(test.addRequest(new Request("offset", 4_000)));
  }

  @Test
  void verifyRequest_standardAndOffsetRequestsThatFit_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 50_000)));
    assertTrue(test.addRequest(new Request("offset", 10_000)));
  }

  @Test
  void verifyRequest_duplicateStandardAndOffsetRequests_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 10_000)));
    assertTrue(test.addRequest(new Request("offset", 10_000)));
  }

  @Test
  void verifyRequest_StandardAndOffsetRequestsInUpperCaseThatFit_Accepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("STANDARD", 1)));
    assertTrue(test.addRequest(new Request("STANDARD", 1)));
    assertTrue(test.addRequest(new Request("OFFSET", 1)));
    assertTrue(test.addRequest(new Request("OFFSET", 1)));
  }

  @Test
  void verifyRequest_offsetAndStandardRequests_standardRejectedAndOffsetAccepted() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("standard", 100_000)));
    assertTrue(test.addRequest(new Request("offset", 10)));
  }

  @Test
  void verifyRequest_offsetAndStandardRequests_offsetRejectedAndStandardAccepted() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 11)));
    assertFalse(test.addRequest(new Request("offset", 100_001)));
  }

  @Test
  void verifyRequest_multipleOffsetRequests_firstRequestAcceptedSecondRejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("offset", 19_999)));
    assertTrue(test.addRequest(new Request("offset", 999)));
  }

  @Test
  void verifyRequest_multipleStandardRequests_secondRequestAcceptedFirstRejected() {
    StationeryShop test = new StationeryShop();
    assertTrue(test.addRequest(new Request("standard", 9_999)));
    assertFalse(test.addRequest(new Request("standard", 69_999)));
  }

  @Test
  void verifyRequest_exceedsCapacityStandardAndOffsetRequests_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("standard", 50_001)));
    assertFalse(test.addRequest(new Request("offset", 10_001)));
  }

  @Test
  void verifyRequest_exceedsCapacityStandardRequests_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("standard", 71_000)));
  }

  @Test
  void verifyRequest_exceedsCapacityOffsetRequests_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("offset", 12_000)));
  }

  @Test
  void verifyRequest_multipleStandardRequestsExceedsCapacity_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("standard", 71_000)));
    assertFalse(test.addRequest(new Request("standard", 51_000)));
  }

  @Test
  void verifyRequest_multipleOffsetRequestsExceedsCapacity_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("offset", 17_000)));
    assertFalse(test.addRequest(new Request("offset", 11_000)));
  }

  @Test
  void verifyRequest_duplicateStandardRequestsExceedsCapacity_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("standard", 60_000)));
    assertFalse(test.addRequest(new Request("standard", 60_000)));
  }

  @Test
  void verifyRequest_duplicateOffsetRequestsExceedsCapacity_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("offset", 60_000)));
    assertFalse(test.addRequest(new Request("offset", 60_000)));
  }

  @Test
  void verifyRequest_multipleStandardAndOffsetRequestsExceedsCapacity_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("standard", 50_900)));
    assertFalse(test.addRequest(new Request("standard", 50_090)));
    assertFalse(test.addRequest(new Request("offset", 19_000)));
    assertFalse(test.addRequest(new Request("offset", 10_900)));
  }

  @Test
  void verifyRequest_StandardAndOffsetRequestsInUpperCaseExceedsCapacity_rejected() {
    StationeryShop test = new StationeryShop();
    assertFalse(test.addRequest(new Request("STANDARD", 50_900)));
    assertFalse(test.addRequest(new Request("STANDARD", 50_090)));
    assertFalse(test.addRequest(new Request("OFFSET", 19_000)));
    assertFalse(test.addRequest(new Request("OFFSET", 10_900)));
  }
}
