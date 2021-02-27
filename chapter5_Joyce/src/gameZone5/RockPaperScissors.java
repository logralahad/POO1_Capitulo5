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
public class RockPaperScissors {

    private Integer jugador;
    private Integer computadora;

    public void resultado() {
        if (this.jugador == this.computadora) {
            System.out.println("Empate");
        }
        else if ((this.jugador == 1 && this.computadora == 3) ||(this.jugador == 2 && this.computadora == 1) 
                ||(this.jugador == 3 && this.computadora == 2)  ){
            System.out.println("Gano el jugador!");

        }
        else if ((this.jugador == 1 && this.computadora == 2) || (this.jugador == 2 && this.computadora == 3) 
                || (this.jugador == 3 && this.computadora == 1)){
            System.out.println("Perdio el jugador!");
        }

    }

    public Integer getJugador() {
        return jugador;
    }

    public void setJugador(Integer opcion) {
        this.jugador = opcion;
        this.setComputadora();
    }

    public Integer getComputadora() {
        return computadora;
    }

    private void setComputadora() {
        this.computadora = (int)(Math.random() * 3 + 1);
    }
    
    public static String jugada(Integer var){
        switch (var) {
            case 1:
                return "Piedra";
            
            case 2:
                return "Papel";
                
            case 3:
                return "Tijeras";
                
            default:
                throw new AssertionError();
        }
    }
}



