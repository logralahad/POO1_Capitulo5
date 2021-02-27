/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

/**
 *
 * @author logra
 */
public class TwelveDays {

    private Integer dia;
    private final String verso = "A day of Christmas my true love gave to me";
    private final String d1 = "A partridge in a pear tree";
    private final String d2 = "Two turtle doves ";
    private final String d3 = "Three French hens";
    private final String d4 = "Four calling birds";
    private final String d5 = "Five gold rings";
    private final String d6 = "Six geese a laying";
    private final String d7 = "Seven swans a swimming";
    private final String d8 = "Eight maids a milking";
    private final String d9 = "Nine ladies dancing";
    private final String d10 = "Ten lords a leaping";
    private final String d11 = "Eleven pipers piping";
    private final String d12 = "Twelve drummers drumming";

    public TwelveDays() {
        this.dia = 1;
    }

    public void diaMas(){
        this.dia += 1;
        if(this.dia > 12){
            this.dia = 1;
        }
    }
    public void setDia(Integer dia){
        this.dia = dia;
    }
    
    public void getCancion(){
        System.out.println(verso);
        System.out.println(this.getVerso(this.dia));
    }
    
    private String getVerso(Integer n){
        if(n == 1){
            return this.d1;
        }else{
            return getVerso(n - 1) + "\n" + getParrafo(n);
        }
    }
    
    private String getParrafo(Integer n){
        switch(n){
            case 12: 
                return d12;
            case 11:
                return d11;
            case 10:
                return d10;
            case 9: 
                return d9;
            case 8:
                return d8;
            case 7:
                return d7;
            case 6:
                return d6;
            case 5: 
                return d5;
            case 4:
                return d4;
            case 3: 
                return d3;
            case 2: 
                return d2;
            default:
                return "No hay mas";                  
        }
                
    }
}
