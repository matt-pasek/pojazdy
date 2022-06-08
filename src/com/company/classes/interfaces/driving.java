package com.company.classes.interfaces;

public interface driving {
  default void go(int velocity) {
    System.out.println("Jadę z prędkością " + velocity);
  }
}
