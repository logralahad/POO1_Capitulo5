/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScholarShip pepe = new ScholarShip(4.0, 1, 0);
        ScholarShip juan = new ScholarShip(3.2, 2, 3);
        
        System.out.println(pepe.toString());
        System.out.println(juan.toString());
    }
    
}
