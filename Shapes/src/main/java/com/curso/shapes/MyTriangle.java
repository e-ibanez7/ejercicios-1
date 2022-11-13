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
    
    public double getPerimeter(){
        double distance0_1 = this.getPithagoras(this.xpoints[0], this.ypoints[0], this.xpoints[1], this.ypoints[1]);
        double distance1_2 = this.getPithagoras(this.xpoints[1], this.ypoints[1], this.xpoints[2], this.ypoints[2]);
        double distance0_2 = this.getPithagoras(this.xpoints[2], this.ypoints[2], this.xpoints[0], this.ypoints[0]);
        
        return distance0_1 + distance1_2 + distance0_2;
    }
    public double getArea(){
        double base = this.getPithagoras(this.xpoints[0], this.ypoints[0], this.xpoints[1], this.ypoints[1]);
        
        
        return 0.0;
    }
    
    public double getPithagoras(int x1, int y1, int x2, int y2){
        double dx = Math.abs(x1 - x2);
        double dy = Math.abs(y1 - y2);
        double distance = Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
        return distance;
    }
}
