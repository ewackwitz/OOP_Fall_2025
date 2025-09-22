package edu.cvtc.java;

public class Course {

  // Attributes
  private String courseID;
  private String courseName;
  private String description;
  private double cost;
  private String location;
  private int capacity;
  private String dateTime;

  // Constructors
  public Course() {}

  public Course(String courseID, String courseName,
                String description, double cost,
                String location, int capacity, String dateTime) {
    setCourseID(courseID);
    setCourseName(courseName);
    setDescription(description);
    setCost(cost);
    setLocation(location);
    setCapacity(capacity);
    setDateTime(dateTime);
  }

  // Methods
  public String getCourseID() {
    return courseID;
  }

  public void setCourseID(String courseID) {
    this.courseID = courseID;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


  @Override
  public String toString() {
    String retVal = "";

    retVal += "------ COURSES ------" + "\n";
    retVal += getCourseName() + "\n";
    retVal += getDescription() + "\n";
    retVal += getCost() + "\n";
    retVal += getCapacity() + "\n";
    retVal += getLocation() + "\n\n";

    return retVal;
  }
}
