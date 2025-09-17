package edu.cvtc.java;

public class SCEDriverConstructors {
  public static void main(String[] args) {

    Student john = new Student("111A", "John",
        "Doe", "01/01/2000",
        "111 Main Street",
        "(111) 222-3333",
        "jdoe@student.cvtc.edu",
        true, "Cash");


    Course web1 = new Course("1", "Web 1", "An introduction to HTML & CSS",
        350.0, "BEC 165", 30, "T/TH 9:00-12:00");

    /*
    web1.setCourseName("Web 1");
    web1.setDescription("An introduction to HTML & CSS");
    web1.setCost(350.0);
    web1.setLocation("BEC 165");
     */

  }
}
