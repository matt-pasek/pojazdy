package com.company.classes.engines;

import com.company.classes.parent.Engine;

// dziedziczenie klasy - extends
public class ElectricEngine extends Engine {

  int batterySize;

  public ElectricEngine(int batterySize) {
    this.batterySize = batterySize;
  }

  @Override
  public void startEngine() {
    System.out.println("Uruchomiłem silnik");
  }

  public ElectricEngine() {}

  @Override
  public void refuel(int amountOfFuel) {}
}
