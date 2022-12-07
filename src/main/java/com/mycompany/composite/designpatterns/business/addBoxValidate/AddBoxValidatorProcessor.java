package com.mycompany.composite.designpatterns.business.addBoxValidate;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.composite.designpatterns.business.addBoxValidate.handlers.AddBoxValidatorHandler;
import com.mycompany.composite.designpatterns.business.products.Component;

public class AddBoxValidatorProcessor {
  List<AddBoxValidatorHandler> handlers = new ArrayList<>();

  public void add(AddBoxValidatorHandler addBoxValidateHandler) {
    this.handlers.add(addBoxValidateHandler);
  }

  public boolean validate(Component item) {
    for (AddBoxValidatorHandler handler : this.handlers) {
      if (!handler.accept(item)) {
        return false;
      }
    }

    return true;
  }

}
