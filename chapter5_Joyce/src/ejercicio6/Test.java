/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author logra
 */
public class Test {
    public static void main(String[] args) {
        Salario juan = new Salario(1,52);
        Salario pepe = new Salario(3,43);
        
        System.out.println("Trabajador Juan:");
        juan.jubilacion();
        juan.seguro();
        juan.getSalario();
        
        System.out.println("Trabajador Pepe:");
        pepe.jubilacion();
        pepe.seguro();
        pepe.getSalario();
    }
}
