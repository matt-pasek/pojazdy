package com.company.classes.interfaces;

public interface flying {
  default void land() {
    System.out.println("Ląduje");
  }

  default void fly(int velocity, int height) {
    System.out.println(
      "Lecę z prędkością " + velocity + " i na wysokości " + height
    );
  }
}
