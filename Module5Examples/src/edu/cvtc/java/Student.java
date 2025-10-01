package edu.cvtc.java;

public abstract class Student {

  // Attributes
  private String name;
  private String id;
  private int yearStarted;

  // Overloaded Constructor
  public Student(String name, String id, int yearStarted) {
    this.name = name;
    this.id = id;
    this.yearStarted = yearStarted;
  }

  // toString
  @Override
  public String toString() {
    String retVal = "";

    retVal += "Name: " + name + "\n";
    retVal += "ID: " + id + "\n";
    retVal += "Year Started: " + yearStarted + "\n";

    return retVal;
  }

  // Method that will be used by all classes that inherit
  // from the Student
  public abstract int creditsUntilCompletion();
}
