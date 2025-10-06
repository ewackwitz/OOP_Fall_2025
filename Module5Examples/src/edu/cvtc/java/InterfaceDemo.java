package edu.cvtc.java;

public class InterfaceDemo {

  public static void main(String[] args) {

    FinalExam2 exam1 = new FinalExam2(100, 20);
    FinalExam2 exam2 = new FinalExam2(100, 30);

    System.out.println("Exam #1: " + exam1.getScore());
    System.out.println("Exam #2: " + exam2.getScore());

    if(exam1.equals(exam2)) {
      System.out.println("Exam #1 and Exam #2 are equal");
    }

    if(exam1.isLessThan(exam2)) {
      System.out.println("Exam #1 is less than Exam #2");
    }

    if(exam1.isGreaterThan(exam2)) {
      System.out.println("Exam #1 is greater than Exam #2");
    }



  }

}
