package edu.cvtc.java;

public class InheritanceDriverDemo {

  public static void main(String[] args) {

    Michael michael = new Michael();

    michael.setHairColor("Red");
    michael.setEyeColor("Green");
    michael.setHeight("6'4");
    michael.setHasFreckles(true);


    System.out.println("Michael's hair color: " + michael.getHairColor());
    System.out.println("Michael's eye color: " + michael.getEyeColor());
    System.out.println("Michael's height: " + michael.getHeight());
    System.out.println("Michael's freckles: " + michael.getHasFreckles());
  }

}
