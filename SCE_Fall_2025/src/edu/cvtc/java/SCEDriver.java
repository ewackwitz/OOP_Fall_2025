package edu.cvtc.java;

public class SCEDriver {

  public static void main(String[] args) {

    // Declare Objects
    // Student
    Student john = new Student();
    Student pie = new Student();
    Student cookie = new Student();
    Student bread = new Student();

    // Course
    Course web1 = new Course();
    Course progFund = new Course();
    Course mathLogic = new Course();
    Course writtenComm = new Course();

    // Enrollment
    Enrollment johnEnrollment = new Enrollment();
    Enrollment pieEnrollment = new Enrollment();
    Enrollment cookieEnrollment = new Enrollment();
    Enrollment breadEnrollment = new Enrollment();


    // Fill objects
    // Student
    john.setStudentID("111A");
    john.setFirstName("John");
    john.setLastName("Doe");
    john.setEmailAddress("jdoe@student.cvtc.edu");

    pie.setStudentID("222B");
    pie.setFirstName("Pie");
    pie.setLastName("Doe");
    pie.setEmailAddress("pdoe@student.cvtc.edu");

    cookie.setStudentID("333C");
    cookie.setFirstName("Cookie");
    cookie.setLastName("Doe");
    cookie.setEmailAddress("cdoe@student.cvtc.edu");

    bread.setStudentID("444D");
    bread.setFirstName("Bread");
    bread.setLastName("Doe");
    bread.setEmailAddress("bdoe@student.cvtc.edu");

    // Course
    web1.setCourseName("Web 1");
    web1.setDescription("An introduction to HTML & CSS");
    web1.setCost(350.0);
    web1.setLocation("BEC 165");

    progFund.setCourseName("Programming Fundamentals");
    progFund.setDescription("An introduction to Programming");
    progFund.setCost(375.0);
    progFund.setLocation("BEC 163");

    mathLogic.setCourseName("Math & Logic");
    mathLogic.setDescription("A math class with an emphasis on logic");
    mathLogic.setCost(400.0);
    mathLogic.setLocation("BEC 202");

    writtenComm.setCourseName("Written Communication");
    writtenComm.setDescription("An english class to improve writing skills");
    writtenComm.setCost(425.0);
    writtenComm.setLocation("BEC 240");

    // Set Student-Course relationship
    Course[] johnsCourses = {web1, progFund, mathLogic, writtenComm};
    Course[] piesCourses = {web1, progFund};
    Course[] cookiesCourses = {mathLogic, web1};
    Course[] breadsCourses = {web1, progFund, mathLogic};

    // Enrollment
    johnEnrollment.setStudent(john);
    johnEnrollment.setCourses(johnsCourses);

    pieEnrollment.setStudent(pie);
    pieEnrollment.setCourses(piesCourses);

    cookieEnrollment.setStudent(cookie);
    cookieEnrollment.setCourses(cookiesCourses);

    breadEnrollment.setStudent(bread);
    breadEnrollment.setCourses(breadsCourses);


    // Display information using Enrollment object ONLY
//    System.out.println(john.getFirstName()); // WRONG
//    System.out.println(johnEnrollment.getStudent().getFirstName()); // RIGHT! ☺️

    /*
    WRONG!

    Student[] students = {john, pie, cookie, bread};

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].getFirstName() + " " + students[i].getLastName());
    }
     */

    // RIGHT! ☺️
    Enrollment[] enrollments = {johnEnrollment, pieEnrollment,
        cookieEnrollment, breadEnrollment};

    for (int i = 0; i < enrollments.length; i++) {
      System.out.println("------ STUDENT ------");
      System.out.println(enrollments[i].getStudent().getFirstName() + " " +
          enrollments[i].getStudent().getLastName());
      System.out.println(enrollments[i].getStudent().getStudentID());
      System.out.println(enrollments[i].getStudent().getEmailAddress());
      System.out.println();

      for (int j = 0; j < enrollments[i].getCourses().length; j++) {
        System.out.println("------ COURSES ------");
        System.out.println(enrollments[i].getCourses()[j].getCourseName());
        System.out.println(enrollments[i].getCourses()[j].getDescription());
        System.out.println(enrollments[i].getCourses()[j].getCost());
        System.out.println(enrollments[i].getCourses()[j].getLocation());
        System.out.println();
        System.out.println();
      }

    }

  }

}
