package com.revof11.javacircleci;

import org.testng.annotations.Test;

/**
 * Simple test that checks the system security setup.
 */
@Test (
  description = "Simple test that checks the system security setup."
)
public class SecurityVerifierTest {

  /**
   * Tests the basics of system security.
   */
  @Test (
    description = "Tests the basics of system security."
  )
  public void testBasics() {
    new SecurityVerifier().assertSecureSystem();
  }
}
