package org.vdt.design.patterns.factorymethod.generic;

/**
 * @Author Admin
 * @create 14/03/2021 21:22
 */
public class Main {

    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product pA = creatorA.createProduct();
        pA.doStuff();


        Creator creatorB = new ConcreteCreatorB();
        Product pB = creatorB.createProduct();
        pB.doStuff();
    }
}
