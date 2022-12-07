package com.mycompany.composite.designpatterns.business.addBoxValidate.handlers;

import com.mycompany.composite.designpatterns.business.products.Component;
import com.mycompany.composite.designpatterns.business.products.Product;

public class ProductTypeValidatorHandler implements AddBoxValidatorHandler {
  public boolean accept(Component component) {
    if (!(component instanceof Product)) {
      return true;
    }

    if (((Product) component).getProductType().equals("perecivel")) {
      throw new RuntimeException(component.getName() + " é um produto perecível, portanto não pode ser adicionado!");
    }

    return true;
  }
}
