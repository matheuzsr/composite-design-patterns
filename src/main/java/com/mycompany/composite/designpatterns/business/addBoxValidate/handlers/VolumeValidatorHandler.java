package com.mycompany.composite.designpatterns.business.addBoxValidate.handlers;

import com.mycompany.composite.designpatterns.business.products.Component;

public class VolumeValidatorHandler implements AddBoxValidatorHandler {
  public boolean accept(Component component) {
    return true;
  }
}
