package edu.cvtc.java;

public class BoxDemo {

  public static void main(String[] args) {
    Box box = new Box(3.0,2.0,2.0);

    System.out.println("Volume: " + box.getVolume());
    System.out.println("Surface Area: " + box.getSurfaceArea());
  }

}
