/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Lottery {
    
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Card carta = new Card();
        
        System.out.println("Introduzca el primer numero de su jugada:");
        int n1 = read.nextInt();
        
        System.out.println("Introduzca el segundo numero de su jugada:");
        int n2 = read.nextInt();
        
        System.out.println("Introduzca el tercer numero de su jugada");
        int n3 = read.nextInt();
        
        
        
        System.out.println("Los numeros ganadores son:");
        System.out.println(carta);
        
        if ((n1 == carta.getNum1()) && (n2 == carta.getNum2()) && (n3 == carta.getNum3())) {
            System.out.println("Ha ganado 1,000,000!");
        }
        else if(((n1 == carta.getNum2()) || (n1 == carta.getNum3())) && 
                ((n2 == carta.getNum1()) || (n2 == carta.getNum3())) && 
                ((n3 == carta.getNum1()) || (n3 == carta.getNum2()))){
            System.out.println("Ha ganado 1,000!");
        }
        else if((n1 == carta.getNum2()) || (n1 == carta.getNum3()) || (n1 == carta.getNum1())){
            
            if((n2 == carta.getNum1())||(n2 == carta.getNum3())||(n2 == carta.getNum2())){
                System.out.println("Has ganado 100");
            }
            else if((n3 == carta.getNum1())||(n3 == carta.getNum2())||(n3 == carta.getNum3())){
                System.out.println("Has ganado 100");
            }
            else{
                System.out.println("Has ganado 10");
            }
        }
        else if((n2 == carta.getNum1()) || (n2 == carta.getNum3()) || (n2 == carta.getNum2())){
            System.out.println("Has ganado 10");
        }
        else if((n3 == carta.getNum2() || (n3 == carta.getNum1())||(n3 == carta.getNum3()))){
            System.out.println("Has ganado 10");
        }
        else{
            System.out.println("No has ganado");
        }
        
    }
}
