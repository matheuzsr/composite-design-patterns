/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.composite.designpatterns;

import com.mycompany.composite.designpatterns.business.addBoxValidate.AddBoxValidatorProcessor;
import com.mycompany.composite.designpatterns.business.addBoxValidate.handlers.ProductTypeValidatorHandler;
import com.mycompany.composite.designpatterns.business.addBoxValidate.handlers.QuantityItemsValidatorHandler;
import com.mycompany.composite.designpatterns.business.addBoxValidate.handlers.VolumeValidatorHandler;
import com.mycompany.composite.designpatterns.business.addBoxValidate.handlers.WeightValidatorHandler;
import com.mycompany.composite.designpatterns.business.products.Box;
import com.mycompany.composite.designpatterns.business.products.Product;

/**
 *
 * @author logcomex
 */
public class Main {

    public static void main(String[] args) {
        try {
            AddBoxValidatorProcessor addBoxValidatorProcessor = new AddBoxValidatorProcessor();
            addBoxValidatorProcessor.add(new ProductTypeValidatorHandler());
            addBoxValidatorProcessor.add(new QuantityItemsValidatorHandler());
            addBoxValidatorProcessor.add(new VolumeValidatorHandler());
            addBoxValidatorProcessor.add(new WeightValidatorHandler());

            Product marteloProduct = new Product("marteloProduct", 0.0, 100.0, "perecivel");
            Box caixaPequena = new Box("caixaPequena", 0.0, 100.0, addBoxValidatorProcessor);
            caixaPequena.add(marteloProduct);

            Box caixaGrande = new Box("caixaGrande", 0.0, 1000.0, addBoxValidatorProcessor);
            caixaGrande.add(caixaPequena);

        } catch (Exception e) {
            System.out.println("Falha: " + e.getMessage());
        }
    }
}
