package org.vdt.design.patterns.factorymethod.generic;

/**
 * @Author Admin
 * @create 14/03/2021 21:20
 */
public class ConcreteCreatorA extends Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
