package edu.cvtc.java;

public class Student {

  // Attributes
  private String studentID;
  private String firstName;
  private String lastName;
  private String dateOfBirth;
  private String streetAddress;
  private String phoneNumber;
  private String emailAddress;
  private boolean eligibility;
  private String paymentType;

  // Constructor
  public Student() {

  }

  public Student(String studentID, String firstName,
                 String lastName, String dateOfBirth,
                 String streetAddress,
                 String phoneNumber, String emailAddress,
                 boolean eligibility, String paymentType) {
    setStudentID(studentID);
    setFirstName(firstName);
    setLastName(lastName);
    setDateOfBirth(dateOfBirth);
    setStreetAddress(streetAddress);
    setPhoneNumber(phoneNumber);
    setEmailAddress(emailAddress);
    setEligibility(eligibility);
    setPaymentType(paymentType);
  }

  // Methods
  public String getStudentID() {
    return studentID;
  }

  public void setStudentID(String studentID) {
    this.studentID = studentID;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public boolean getEligibility() {
    return eligibility;
  }

  public void setEligibility(boolean eligibility) {
    this.eligibility = eligibility;
  }

  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  @Override
  public String toString() {
    String retVal = "";

    retVal += "------ STUDENT ------" + "\n";
    retVal += getFirstName() + " " + getLastName() + "\n";
    retVal += getStudentID() + "\n";
    retVal += getEmailAddress() + "\n\n";

    return retVal;
  }
}
