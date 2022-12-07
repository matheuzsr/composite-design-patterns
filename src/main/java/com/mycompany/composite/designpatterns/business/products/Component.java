package com.mycompany.composite.designpatterns.business.products;

public abstract class Component {
  protected String name;
  protected double price;
  protected double volume;

  public Component(String name, double price, double volume) {
    this.name = name;
    this.price = price;
    this.volume = volume;
  }

  public abstract String getName();

  public abstract double getPrice();

  public abstract double getVolume();
}
