package edu.cvtc.java;

public class Box extends Rectangle {

  // Attribute
  private double height;

  // Overloaded Constructor
  public Box(double length, double width, double height) {
    super(width, length);
    this.height = height;
  }

  // Methods
  public double getHeight() {
    return height;
  }

  public double getSurfaceArea() {
    return (getArea() * 2) +
        (getWidth() * getHeight() * 2) +
        (getLength() * getHeight() * 2);
  }

  public double getVolume() {
    return getArea() * getHeight();
  }
}
