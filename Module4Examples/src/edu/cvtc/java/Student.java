package edu.cvtc.java;

public class Student {

  // Attribute
  private String studentID;

  public Student() {}

  public Student(String studentID) {
//    this.studentID = studentID;
    setStudentID(studentID);
  }


  // Method
  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String studentID) {
    if (isValidStudentId(studentID)) {
      this.studentID = studentID;
    } else {
      this.studentID = "INVALID STUDENT ID";
    }
  }

  private boolean isValidStudentId(String studentID) {
    boolean retVal = true;

    // Check length - 10 characters
    if (studentID.length() != 10) {
      retVal = false;
    }

    // Check for special character '@' - (0)
    if (retVal) {
      if (studentID.charAt(0) != '@') {
        retVal = false;
      }
    }

    // Check for digits - (1-6)
    if (retVal) {
      for (int i = 1; i <= 6; i++) {
        if (!Character.isDigit(studentID.charAt(i))) {
          retVal = false;
        }
      }
    }

    // Check for upper case letters - (7-9)
    if (retVal) {
      for (int i = 7; i <= 9; i++) {
        if (!Character.isLetter(studentID.charAt(i)) ||
            !Character.isUpperCase(studentID.charAt(i))) {
          retVal = false;
        }
      }
    }

    return retVal;
  }
}
