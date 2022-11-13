/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.supermercado;

import java.util.ArrayList;

/**
 *
 * @author eibaneza
 */
public class Supermarket {
    private ArrayList<Product> products;
    
    public Supermarket (){
        products = new ArrayList<> ();
    }
    
    public void addProduct (String name, double price, int avaiable) {
        this.products.add(new Product(name,price,avaiable));
    }
    
    public void showSupermarket(){
        for(Product p: products){
            System.out.println(p.getName() + " ..... " + p.getPrice() + "€....Disponibilidad: " + p.getAvaiable() + " unidades");
        }
    }
}
