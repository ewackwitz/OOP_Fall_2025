package edu.cvtc.java;

public class Countable {

  private static int instanceCount = 0;

  public Countable() {
    instanceCount++;
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

}
