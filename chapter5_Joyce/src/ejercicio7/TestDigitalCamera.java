/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class TestDigitalCamera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Escriba la marca: ");
            String marca = sc.nextLine();
            
            System.out.print("Cantidad de megapixeles: ");
            int mp = sc.nextInt();
            sc.nextLine();
            
            DigitalCamera cam = new DigitalCamera(marca, mp);
            System.out.println(cam.detalles());
        }
    }
    
}
