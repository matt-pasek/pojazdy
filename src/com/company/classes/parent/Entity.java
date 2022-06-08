package com.company.classes.parent;

import java.math.BigDecimal;

// klasa abstrakcyjna
public abstract class Entity {

  protected String name;
  public BigDecimal price;

  public void printParentName() {
    String superClass = this.getClass().getSuperclass().getSimpleName();
    System.out.println(superClass);
  }

  public void printName() {
    System.out.println(this.name);
  }

  public void buy(BigDecimal price) {
    String className = this.getClass().getSimpleName();
    System.out.println(
      "kupuję " + className + " " + this.name + " Cena = " + price.toString()
    );
  }

  public void sell(BigDecimal price) {
    String className = this.getClass().getSimpleName();
    System.out.println(
      "sprzedaję " + className + this.name + " Cena = " + price.toString()
    );
  }
}
