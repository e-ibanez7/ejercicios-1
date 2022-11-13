/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.shapes;

/**
 *
 * @author eibaneza
 */

public class MySquare extends MyRectangle {
    
    
    public MySquare () {
    }
    
    public MySquare(int side){
        super(side,side);
    }
    
    public MySquare(int side, int x, int y){
        super(x,y,side,side);
    }
    
    @Override
    public double getPerimeter(){
        return this.getHeight()*4;
    }
    
    @Override
    public double getArea(){
        return this.getHeight() * 2;
    }
}
