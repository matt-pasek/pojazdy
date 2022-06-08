package com.company.classes.vehicles;

import com.company.VehicleColor;
import com.company.classes.engines.CombustionEngine;
import com.company.classes.type.Driving;
import java.math.BigDecimal;

// dziedziczenie klasy - extends
public class DeliveryVan extends Driving {

  public DeliveryVan(
    String name,
    BigDecimal price,
    VehicleColor color,
    int maxVelocity,
    CombustionEngine engine
  ) {
    this.name = name;
    this.price = price;
    this.color = color;
    this.maxVelocity = maxVelocity;
    this.engine = engine;
  }

  public DeliveryVan() {}
}
