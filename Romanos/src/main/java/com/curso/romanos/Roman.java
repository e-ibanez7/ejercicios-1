/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.romanos;

/**
 *
 * @author eibaneza
 */
public class Roman {
    private String romanNumber;
    
    public Roman (String romanNumber) {
        this.romanNumber = romanNumber;
    }
    public String getRoman (){
        return this.romanNumber;
    }
    
    public int convertToDecimal () {
        int result=0;
        char [] romano = this.romanNumber.toCharArray();
        int i=0;
        
        do {
            char character = Character.toUpperCase(romano[i]);
            if (i == romano.length-1)
                
                result = result + this.conversor(character);
            else {
                if (romano[i+1] == 'V' || romano[i+1] == 'L' || romano[i+1] == 'D'){
                    result = result + conversor(romano[i+1]) - conversor (romano[i]);
                    i++;
                }
                else if ( (romano[i] == 'I' && romano[i+1] == 'X') || (romano[i] == 'X' && romano[i+1] == 'C') || (romano[i] == 'C' && romano[i+1] == 'M')){
                    result = result + conversor(romano[i+1]) - conversor (romano[i]);
                    i++;
                }
                else
                    result = result + conversor(romano[i]);
            }
            i++;
        } while (i<romano.length);
        
        
        
        return result;
    }
    public int conversor (char c) {
        int result;
        switch (c) {
                case 'I' -> result=1;
                case 'V' -> result=5;
                case 'X' -> result=10;
                case 'L' -> result=50;
                case 'C' -> result=100;
                case 'D' -> result=500;
                case 'M' -> result=1000;
                default ->  result=0;
        }
        return result;
    }
    
}
