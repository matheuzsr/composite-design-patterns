package com.mycompany.composite.designpatterns.business.products;

public class Product extends Component {
  private String productType;

  public Product(String name, double price, double volume, String type) {
    super(name, price, volume);
    this.productType = type;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public double getVolume() {
    return this.volume;
  }

  public String getProductType() {
    return productType;
  }
}
