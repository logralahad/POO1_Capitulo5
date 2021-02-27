/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone5;

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
        RockPaperScissors game = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("[1]Piedra [2]Papel [3]Tijeras: ");
        game.setJugador(sc.nextInt());
        System.out.println("Computadora saco: " + RockPaperScissors.jugada(game.getComputadora()));
        game.resultado();
    }
}
