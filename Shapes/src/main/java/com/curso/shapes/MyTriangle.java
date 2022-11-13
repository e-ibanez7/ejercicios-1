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
public class MyTriangle extends Polygon {
    
    public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3){
        this.addPoint(x1, y1);
        this.addPoint(x2, y2);
        this.addPoint(x3, y3);
    }
    
    //In a 2 coordinates syste, the value of the distance beetween 2 points is always the Hypotenuse of a rectangled triangle
    public double getPerimeter(){
        double side1 = this.getHypotenuse(this.xpoints[0], this.ypoints[0], this.xpoints[1], this.ypoints[1]);
        double side2 = this.getHypotenuse(this.xpoints[1], this.ypoints[1], this.xpoints[2], this.ypoints[2]);
        double side3 = this.getHypotenuse(this.xpoints[2], this.ypoints[2], this.xpoints[0], this.ypoints[0]);
        
        return side1+ side2 + side3;
    }
    
    
    // Heron's formula: https://en.wikipedia.org/wiki/Heron%27s_formula
    public double getArea(){
        double semiperimeter = this.getPerimeter()/2;
        double side1 = this.getHypotenuse(this.xpoints[0], this.ypoints[0], this.xpoints[1], this.ypoints[1]);
        double side2 = this.getHypotenuse(this.xpoints[1], this.ypoints[1], this.xpoints[2], this.ypoints[2]);
        double side3 = this.getHypotenuse(this.xpoints[2], this.ypoints[2], this.xpoints[0], this.ypoints[0]);
        
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
        
    }
    
    public double getHypotenuse(int x1, int y1, int x2, int y2){
        double dx = Math.abs(x1 - x2);
        double dy = Math.abs(y1 - y2);
        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }
}
