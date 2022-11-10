/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.romanos;

/**
 *
 * @author eibaneza
 */
public class Romanos {

    public static void main(String[] args) {
        Roman julius = new Roman ("MCDLXXIX");
        
        System.out.println(julius.getRoman() + " en decimal es " + julius.convertToDecimal());
    }
}
