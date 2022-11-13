/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.calculadora;

/**
 *
 * @author K
 */
public class Operation {
    private double x;
    private double y;
    
    String operation;
    
    public Operation (double x, double y, String type){
        this.x = x;
        this.y = y;
        this.operation = type;
    }
    public Operation (double x, String type){
        this.x = x;
        this.operation = type;
    }
    
    
    public double operation (){
        double result=0;
        if (this.operation.equals("plus")){
            result = this.x + this.y;
        }
        else if (this.operation.equals("substraction")){
            result = this.x - this.y;
        }
        else if (this.operation.equals("multiply")){
            result = this.x * this.y;
        }
        else if (this.operation.equals("divide")){
            result = this.x / this.y;
        }
        else if (this.operation.equals("power")){
            result = Math.pow(this.x,this.y);
        }
        else if (this.operation.equals("factorize")){
            result = 1;
            for (int i=2; i<this.x; i++){
                result = result * i;
            }
        } 
        return result;
    }
}
