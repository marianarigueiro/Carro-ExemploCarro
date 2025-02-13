package com.mycompany.exemplocarro;

/**
 *
 * @author dti
 */
public class Carro {
    String cor;
    String modelo; 
    String motor;
    
    void ligar () {
        System.out.println("Ligando o carro");
    }
    
    void desligar () {
        System.out.println("Desligar o carro");
    }
    
    void acelerar () {
        System.out.println("Acelerando o carro");
    }
    
    void brecar () {
        System.out.println("Brecando o carro");
    }
    void mudarMarcha () {
        System.out.println("Marcha engatada");
    }
}
