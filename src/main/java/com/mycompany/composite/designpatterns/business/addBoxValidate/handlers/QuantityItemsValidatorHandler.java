package com.mycompany.composite.designpatterns.business.addBoxValidate.handlers;

import com.mycompany.composite.designpatterns.business.products.Component;

public class QuantityItemsValidatorHandler implements AddBoxValidatorHandler {
  public boolean accept(Component component) {
    return true;
  }
}
