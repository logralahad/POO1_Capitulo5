/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author logra
 */
public class Test {
    public static void main(String[] args) {
        Invoice p1 = new Invoice(5200, 522, 1, 5, 2015);
        Invoice p2 = new Invoice(1000, 522, -2, 45, 2015);
        
        p1.mostrar();
        p2.mostrar();
    }
}
