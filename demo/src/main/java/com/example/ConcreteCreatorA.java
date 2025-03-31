package com.example;

// ConcreteCreatorA.java - Fábrica concreta para criar o Produto A
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
