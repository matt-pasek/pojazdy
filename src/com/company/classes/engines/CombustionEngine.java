package com.company.classes.engines;

import com.company.classes.parent.Engine;

// dziedziczenie klasy - extends
public class CombustionEngine extends Engine {

  int engineCapacity;
  int tankCapacity;

  public CombustionEngine(int engineCapacity, int tankCapacity) {
    this.engineCapacity = engineCapacity;
    this.tankCapacity = tankCapacity;
  }

  public CombustionEngine() {}

  @Override
  public void refuel(int amountOfFuel) {
    System.out.println("Zatankowałem " + amountOfFuel + " paliwa");
  }

  @Override
  public void startEngine() {
    System.out.println("Uruchomiłem silnik");
  }
}
