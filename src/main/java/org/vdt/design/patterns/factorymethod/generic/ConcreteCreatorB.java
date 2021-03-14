package org.vdt.design.patterns.factorymethod.generic;

/**
 * @Author Admin
 * @create 14/03/2021 21:21
 */
public class ConcreteCreatorB extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
