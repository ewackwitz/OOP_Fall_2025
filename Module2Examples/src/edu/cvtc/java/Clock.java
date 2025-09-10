package edu.cvtc.java;

public class Clock {

  public static void main(String[] args) {

    for (int hours = 0; hours < 2; hours++) {
      for (int minutes = 0; minutes < 60; minutes++) {
        for (int seconds = 0; seconds < 60; seconds++) {
//          System.out.println(hours + ":" + minutes + ":" + seconds);
          System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
        }
      }
    }


  }

}
