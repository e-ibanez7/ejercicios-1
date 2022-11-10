/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.fibonnacci;

/**
 *
 * @author eibaneza
 */
public class Fibonnacci {

    public static int calcFibonacci (int n) {
        if (n<2)
            return n;
        else {
            return calcFibonacci (n-1) + calcFibonacci (n-2);
        }
    }
    
    public static void main(String[] args) {
        int n = 9;
        System.out.println("El resultado de la sucesión de FIbonnaci hasta " + n + " es igual a " + calcFibonacci(n) );
    }
}
