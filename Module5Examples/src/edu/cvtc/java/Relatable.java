package edu.cvtc.java;

public interface Relatable {

  boolean equals(GradedActivity gradedActivity);
  boolean isLessThan(GradedActivity gradedActivity);
  boolean isGreaterThan(GradedActivity gradedActivity);

}
