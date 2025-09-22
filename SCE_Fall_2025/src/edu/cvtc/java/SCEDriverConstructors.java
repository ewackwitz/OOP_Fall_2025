package edu.cvtc.java;

public class SCEDriverConstructors {
  public static void main(String[] args) {

    // Declare and Fill Objects
    // Student
    Student john = new Student("111A", "John",
        "Doe", "01/01/2000",
        "111 Main Street",
        "(111) 111-1111",
        "jdoe@student.cvtc.edu",
        true, "Cash");

    Student pie = new Student("222B", "Pie",
        "Doe", "02/01/2000",
        "222 Main Street",
        "(222) 222-2222",
        "pdoe@student.cvtc.edu",
        true, "Student Loan");

    Student cookie = new Student("333C", "Cookie",
        "Doe", "03/01/2000",
        "333 Main Street",
        "(333) 333-333",
        "cdoe@student.cvtc.edu",
        true, "Credit");

    Student bread = new Student("444D", "Bread",
        "Doe", "04/01/2000",
        "222 Main Street",
        "(333) 333-3333",
        "Bdoe@student.cvtc.edu",
        true, "Grant");


    // Course
    Course web1 = new Course("107", "Web 1",
        "An introduction to HTML & CSS",
        350.0, "BEC 165", 30, "T/TH 1:00-4:00");

    Course progFund = new Course("101", "Programming Fundamentals",
        "An introduction to Programming",
        350.0, "BEC 165", 30, "T/TH 9:00-12:00");

    Course mathLogic = new Course("318", "Math & Logic",
        "A math class with an emphasis on logic",
        350.0, "BEC 218", 30, "M/W/F 9:00-10:00");

    Course writtenComm = new Course("225", "Written Communication",
        "An english class to improve writing skills",
        350.0, "Online", 30, "N/A");


    // Set Student-Course relationship
    Course[] johnsCourses = {web1, progFund, mathLogic, writtenComm};
    Course[] piesCourses = {web1, progFund};
    Course[] cookiesCourses = {mathLogic, web1};
    Course[] breadsCourses = {web1, progFund, mathLogic};


    // Declare and Fill Objects
    // Enrollment
    Enrollment johnEnrollment = new Enrollment(john, johnsCourses);
    Enrollment pieEnrollment = new Enrollment(pie, piesCourses);
    Enrollment cookieEnrollment = new Enrollment(cookie, cookiesCourses);
    Enrollment breadEnrollment = new Enrollment(bread, breadsCourses);


    // Create and Fill Enrollment Array
    Enrollment[] enrollments = {johnEnrollment, pieEnrollment,
        cookieEnrollment, breadEnrollment};


    // Display Information
    for (int i = 0; i < enrollments.length; i++) {
      System.out.println(enrollments[i]);
    }



  }
}
