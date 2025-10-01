package edu.cvtc.java;

public class Polymorphic {

  public static void main(String[] args) {

    final int NUMBER_OF_GRADES = 3;

    GradedActivity[] grades = new GradedActivity[NUMBER_OF_GRADES];

    // First one is a 'true' GradedActivity
    grades[0] = new GradedActivity();
    grades[0].setScore(85.0);

    // Second one is a PassFailExam
    grades[1] = new PassFailExam(70,
        100, 20);

//    System.out.println(grades[1].get);

    // Third one is a FinalExam
    grades[2] = new FinalExam(100, 17);

    for (int i = 0; i < NUMBER_OF_GRADES; i++) {
      System.out.println("Assignment: " + (i + 1) + "\n" +
          "Score: " + grades[i].getScore() + "\n" +
          "Grade: " + grades[i].getGrade() + "\n\n");
    }

  }

}
