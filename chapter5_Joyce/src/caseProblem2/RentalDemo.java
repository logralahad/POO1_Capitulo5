/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class RentalDemo {

    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Rental[] eventos = new Rental[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre de contrato #" + (i + 1) + ": ");
            String name = sc.nextLine();
            
            System.out.print("Numero de minutos: ");
            int inv = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            
            Rental e1 = new Rental(name, inv);
            eventos[i] = e1;
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(eventos[i].aPagar());
            Rental.SammysMotto();
        }
        
        Rental p = Rental.largerRental(eventos[0], eventos[1]);
        System.out.println(p.aPagar());
        
        Rental q = Rental.largerRental(eventos[1], eventos[2]);
        System.out.println(q.aPagar());
        
        Rental r = Rental.largerRental(eventos[0], eventos[2]);
        System.out.println(r.aPagar());

    }
    
}
