package com.company.classes.parent;

import com.company.VehicleColor;

// dziedziczenie klasy - extends        // klasa abstrakcyjna
public abstract class Vehicle extends Entity {

  // dynamiczny polimorfizm       // enkapsulacja(modyfikator dostępu)
  public VehicleColor color;
  // dynamiczny polimorfizm       // enkapsulacja(modyfikator dostępu)
  public Engine engine;
  public int maxVelocity;

  public void printVehicleName() {
    System.out.print(this.name);
  }

  // enkapsulacja(getter)
  public VehicleColor getColor() {
    return color;
  }

  //enkapsulacja(setter)
  public void setColor(VehicleColor color) {
    this.color = color;
  }

  // enkapsulacja(getter)
  public Engine getEngine() {
    return engine;
  }

  //enkapsulacja(setter)
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  // enkapsulacja(getter)
  public int getMaxVelocity() {
    return maxVelocity;
  }

  //enkapsulacja(setter)
  public void setMaxVelocity(int maxVelocity) {
    this.maxVelocity = maxVelocity;
  }
}
