package edu.cvtc.java;

public class ITSDStudent extends Student {

  // Attribute
  private int credits;

  // Constant
  private final int ITSD_HOURS = 60;

  public ITSDStudent(String name, String id, int yearStarted) {
    super(name, id, yearStarted);
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  @Override
  public String toString() {
    String retVal = "";

    retVal += super.toString();
    retVal += "\nCredits: " + credits;
    retVal += "\nRemaining Credits: " + creditsUntilCompletion();

    return retVal;
  }

  @Override
  public int creditsUntilCompletion() {
    return ITSD_HOURS - credits;
  }
}
