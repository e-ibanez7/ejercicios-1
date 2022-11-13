/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.fechas;

import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

/**
 *
 * @author eibaneza
 */
public class Fechassssss {
    private String startDate;
    private String endDate;
    private DateTimeFormatter dateFormat; 
    
    
    public Fechassssss (String startDate, String endDate) {   
        dateFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy");  
    }
    
    public void checkDateFormat (String date) {
        Pattern pattern = Pattern.compile ("(\\/|-|\\.)", Pattern.CASE_INSENSITIVE);
        //^(1-31)([/-.])
        try {
            
        }
        catch (Exception ex){
        }
        
    }
}
