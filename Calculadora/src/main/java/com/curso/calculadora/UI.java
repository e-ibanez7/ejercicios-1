/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.calculadora;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class UI {
    private Scanner inputs;
    private String option;
    
    public UI (){
        this.inputs = new Scanner(System.in);
    }
    
    public void mainMenu (){
        int selection=99;
        boolean error=true;
        
        System.out.println("*************************************************");
        System.out.println("******      Menú Principal Calculadora     ******");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Potencia ");
        System.out.println("6. Factorial ");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("*************************************************");
        do {
            System.out.print("Elija su opción: ");;
            String option = inputs.nextLine();
            try {
                selection = Integer.parseInt(option);
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("Formato Introducido Inváido. Vuelva a introducir otra opción:");
            }
        } while (error);
        
        
        switch (selection) {
            case 0:
                System.exit(0);
            case 1:
                this.operationUI(1);
            case 2:
                this.operationUI(2);
            case 3:
                this.operationUI(3);
            case 4:
                this.operationUI(4);
            case 5:
                this.operationUI(5);
            case 6:
                this.operationUI(6);
            default:
                System.out.println("Opción Inválida. Vuelva a intentarlo");
                this.mainMenu();
        }
    }
    
    
    public void operationUI (int operation) {
        double x=0;
        double y=0;
        String type;
        String option;
        Operation ope = null;
        
        System.out.println("*************************************************");
        try {
            System.out.print("Elijir primer operador: ");;
            option = inputs.nextLine();
            x = Double.parseDouble(option);
            if (operation != 6){
                System.out.print("Elijir segundo operador: ");;
                option = inputs.nextLine();
                y = Double.parseDouble(option);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Formato Introducido Inváido. Vuelva a intentarlo");
            this.operationUI(operation);
        }
        
        switch (operation){
            case 1:
                ope = new Operation(x, y, "plus");
                break;
            case 2:
                ope = new Operation(x, y, "substraction");
                break;
            case 3:
                ope = new Operation(x, y, "multiply");
                break;
            case 4:
                ope = new Operation(x, y, "divide");
                break;
            case 5:
                ope = new Operation(x, y, "power");
                break;
            case 6:
                ope = new Operation(x, "factorize");
                break;
            default:
                this.mainMenu();
        }
        System.out.println("El resultado de la operación es " + ope.operation());
        System.out.println("Volviendo al Menú Principal...");
        this.mainMenu();
    }
}
