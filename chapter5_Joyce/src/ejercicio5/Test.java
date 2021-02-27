/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        Coffee cliente = new Coffee();
        
        int opc = 1;
        
        do {
            Coffee.menuCafe();
            System.out.print("\nElija una opcion: ");
            opc = sc.nextInt();
            
            cliente.setOpcion(opc);
            
        } while (opc != 0);
        
        System.out.println(cliente.precioTotal());
    }
    
}
