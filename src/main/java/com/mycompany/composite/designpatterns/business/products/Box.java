package com.mycompany.composite.designpatterns.business.products;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.composite.designpatterns.business.addBoxValidate.AddBoxValidatorProcessor;

public class Box extends Component {
  private List<Component> items = new ArrayList<>();
  private AddBoxValidatorProcessor addBoxValidatorProcessor;

  public Box(String name, double price, double volume, AddBoxValidatorProcessor addBoxValidatorProcessor) {
    super(name, price, volume);
    this.addBoxValidatorProcessor = addBoxValidatorProcessor;
  }

  @Override
  public String getName() {
    return this.name;
  }

  public String getItemsName() {
    StringBuilder finalName = new StringBuilder();

    for (Component item : this.items) {
      finalName.append(", " + item.getName());
    }

    return finalName.toString();
  }

  @Override
  public double getPrice() {
    for (Component item : this.items) {
      this.price = this.price + item.getPrice();
    }

    return this.price;
  }

  @Override
  public double getVolume() {
    for (Component item : this.items) {
      this.volume = this.volume + item.getVolume();
    }

    return this.volume;
  }

  public void add(Component component) {
    if (this.addBoxValidatorProcessor.validate(component)) {
      this.items.add(component);
    }

    
  }
}
