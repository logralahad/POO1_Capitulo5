/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author logra
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CondoSales2 p = new CondoSales2(8, 0);
        CondoSales2 q = new CondoSales2(1, 2);
        CondoSales2 r = new CondoSales2(2, 1);
        CondoSales2 s = new CondoSales2(3, 3);
        
        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(r.toString());
        System.out.println(s.toString());
    }
    
}
