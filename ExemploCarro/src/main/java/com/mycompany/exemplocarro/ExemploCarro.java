/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplocarro;

/**
 *
 * @author dti
 */
public class ExemploCarro {

    public static void main(String[] args) {
        //Criando uma instância da classe Carro
        Carro umCarro = new Carro ();
        //Atribuindo os valores dos atributos
        umCarro.modelo = "Gol";
        umCarro.cor = "Preto";
        umCarro.motor = "1.0";
        //Executando os métodos do objeto
        umCarro.ligar();
        umCarro.mudarMarcha();
        umCarro.acelerar();
        umCarro.brecar();
        umCarro.desligar();
        
        System.out.println(umCarro.modelo);
        System.out.println(umCarro.cor);
        System.out.println(umCarro.motor);

        
        //Atribuindo null para a variável diz que
        //Agora ela não aponta para lugar nenhum
        umCarro = null;
    }
}
