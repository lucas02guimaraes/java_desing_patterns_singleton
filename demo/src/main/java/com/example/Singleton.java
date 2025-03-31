package com.example;

// Singleton.java - Implementação do padrão Singleton
public class Singleton {
    private static Singleton instance;

    // O construtor é privado para garantir que a instância seja única
    private Singleton() {
    }

    // Método para obter a instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Olá, sou o Singleton!");
    }

}