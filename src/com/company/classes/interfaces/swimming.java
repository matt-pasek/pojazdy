package com.company.classes.interfaces;

public interface swimming {
  default void swim(int velocity) {
    System.out.println("Płynę z prędkością " + velocity);
  }
}
