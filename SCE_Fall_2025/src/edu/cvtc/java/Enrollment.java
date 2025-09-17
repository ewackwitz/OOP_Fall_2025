package edu.cvtc.java;

public class Enrollment {

  // Attributes
  private Student student;
  private Course[] courses;

  // Constructors
  public Enrollment() {}

  public Enrollment(Student student, Course[] courses) {
    setStudent(student);
    setCourses(courses);
  }

  // Methods
  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Course[] getCourses() {
    return courses;
  }

  public void setCourses(Course[] courses) {
    this.courses = courses;
  }
}
