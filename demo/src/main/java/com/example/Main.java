package com.example;

// Main.java - Classe principal para testar os padrões de projeto
public class Main {
    public static void main(String[] args) {
        // Testando o Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Testando o Factory Method
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.use();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.use();
    }
}
