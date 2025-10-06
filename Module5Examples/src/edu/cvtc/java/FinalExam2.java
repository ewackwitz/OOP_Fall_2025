package edu.cvtc.java;

public class FinalExam2 extends GradedActivity implements Relatable {
  // Attributes
  private int numberOfQuestions;
  private int numberOfMissed;
  private double pointsEach;

  // Constructor
  public FinalExam2(int numberOfQuestions, int numberOfMissed) {
    double numericScore;

    this.numberOfQuestions = numberOfQuestions;
    this.numberOfMissed = numberOfMissed;

    pointsEach = 100.0 / numberOfQuestions;
    numericScore = 100.0 - (numberOfMissed * pointsEach);

    // Call the superclass setScore method
    setScore(numericScore);
  }


  // Methods
  public int getNumberOfQuestions() {
    return numberOfQuestions;
  }

  public int getNumberOfMissed() {
    return numberOfMissed;
  }

  public double getPointsEach() {
    return pointsEach;
  }

  @Override
  public boolean equals(GradedActivity gradedActivity) {
    boolean status = false;

    if (this.getScore() == gradedActivity.getScore()) {
      status = true;
    }

    return status;
  }

  @Override
  public boolean isLessThan(GradedActivity gradedActivity) {
    boolean status = false;

    if (this.getScore() < gradedActivity.getScore()) {
      status = true;
    }

    return status;
  }

  @Override
  public boolean isGreaterThan(GradedActivity gradedActivity) {
    boolean status = false;

    if (this.getScore() > gradedActivity.getScore()) {
      status = true;
    }

    return status;
  }
}
