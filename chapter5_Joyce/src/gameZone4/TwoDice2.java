/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

/**
 *
 * @author logra
 */
public class TwoDice2 {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        
        System.out.println(d1 + "\n" +d2);
        if (d1.getNumero() == d2.getNumero()) {
            System.out.println("Los dados son iguales");
        }
        else if(d1.getNumero() > d2.getNumero()){
            System.out.println("El dado 1 es mayor");
        }
        else{
            System.out.println("El dado 2 es mayor");
        }
    }
}
