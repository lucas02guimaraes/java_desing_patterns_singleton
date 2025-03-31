package com.example;

// ConcreteCreatorB.java - Fábrica concreta para criar o Produto B
class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }

}