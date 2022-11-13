/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.shapes;

import java.awt.Rectangle;

/**
 *
 * @author eibaneza
 */
public class MyRectangle extends Rectangle {
    
    
    public MyRectangle (){}
    
    public MyRectangle (int width, int height) {
       super(width, height);
    }
    public MyRectangle (int width, int height, int x, int y){
        super(x,y,width,height);
    }
    
    
    public double getPerimeter(){
        return (this.getHeight()*2) + (this.getWidth() *2);
    }
    
    public double getArea(){
        return this.getHeight() * this.getWidth();
    }
    
}
