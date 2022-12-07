package com.mycompany.composite.designpatterns.business.addBoxValidate.handlers;

import com.mycompany.composite.designpatterns.business.products.Component;

public interface AddBoxValidatorHandler {
  public boolean accept(Component component);
}
