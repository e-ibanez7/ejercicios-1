/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.shapes;

import java.awt.Polygon;

/**
 *
 * @author eibaneza
 */
public class MyCircle extends Polygon{
    private double radius;
    
    public MyCircle(int x, int y, double radius){
        this.addPoint(x, y);
        this.radius = radius;
    }
    
    
    public double getRadius (){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
