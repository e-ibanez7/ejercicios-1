/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.supermercado;

/**
 *
 * @author eibaneza
 */
public class Supermercado {

    public static void main(String[] args) {
        Supermarket mercadona = new Supermarket();
        mercadona.addProduct("Alahmbra Especial", 0.60, 87);
        mercadona.addProduct("Jack Daniels", 17.9, 22);
        mercadona.addProduct("Estrella Galicia", 0.80, 125);
        
        mercadona.showSupermarket();
        
        System.out.println("Hello World!");
    }
}
