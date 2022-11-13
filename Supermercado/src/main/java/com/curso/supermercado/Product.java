/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.supermercado;

/**
 *
 * @author eibaneza
 */
public class Product {
    String name;
    double price;
    int avaiable;
    
    public Product (String name, double price, int avaiable){
        this.name = name;
        this.price = price;
        this.avaiable = avaiable;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getAvaiable() {
        return avaiable;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void restockProduct (int avaiable) {
        this.avaiable = this.avaiable + avaiable;
    }
    
    
    
    
}
