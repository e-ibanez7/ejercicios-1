/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.fechas;

import java.time.LocalDate;

/**
 *
 * @author eibaneza
 */
public class Fechas {
    
    public static int calculateDays (String date1, String date2){
        String [] date1V = date1.split("/");
        String [] date2V = date2.split("/");
        int leapYears=0;
        int totalDays=0;
        
        int [] parsedDate1 = new int [3];
        int [] parsedDate2 = new int [3];
        
        for (int i=0;i<3;i++) {
            parsedDate1[i] = Integer.parseInt(date1V[i]);
            parsedDate2[i] = Integer.parseInt(date2V[i]);
        }
        if (parsedDate1[2] < parsedDate2[2]){
            for (int i=parsedDate1[2]; i<=parsedDate2[2]; i++){
                if (isLeapYear(i))
                    leapYears++;
            }
            if (parsedDate1[2] - parsedDate2[2] != 0){
                totalDays = Math.abs(parsedDate1[2] - parsedDate2[2]) - leapYears;
                totalDays = (totalDays*365) + (leapYears*366);
            }
        }
            
        else if (parsedDate1[2] == parsedDate2[2]){
            
        }
        
        else {}
        
        return 1;
    }
    
    public static boolean isLeapYear (int year) {
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            return true;
        else
            return false;
    }
    
    
    
    public static void main(String[] args) {
        
        String date1 = "1/1/1980";
        String date2 = "1/1/2022";
   
        System.out.println("Entre el " + date1 + " y el " + date2 + " hay " + calculateDays(date1, date2) + " días");
    }
}
