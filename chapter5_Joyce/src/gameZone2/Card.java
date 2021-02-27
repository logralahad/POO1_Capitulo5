/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author logra
 */
public class Card {
    
    private int num1;
    private int num2;
    private int num3;
    
    public Card(){
        this.num1 = ((int)(Math.random() * 100) % 10 );
        do {
            this.num2 = ((int)(Math.random() * 100) % 10 );
        } while (this.num2 == this.num1);
        do {
            this.num3 = ((int)(Math.random() * 100) % 10 );
        } while ((this.num3 == this.num1)||(this.num3 == this.num2));       
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public Integer getNum3() {
        return num3;
    }

    public String toString() {
        return  String.format("Numero 1: %d\nNumero 2: %d\nNumero 3: %d", num1, num2, num3);
    }
    
    
    
}
