/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZone5;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class RockPaperScissors {

    private Integer opc;
    private Integer opcionPC;

    public void juego() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1]Piedra [2]Papel [3]Tijeras: ");
        setOpcionPC();
        opc = sc.nextInt();
        System.out.println(getOpcionPC());
        

        if (opc == opcionPC) {
            System.out.println("Empate");
        } else if ((opc == 1 && opcionPC == 3) ||(opc == 2 && opcionPC == 1) ||(opc == 3 && opcionPC == 2)  ){
            System.out.println("Ganas");

        } else if ((opc == 1 && opcionPC == 2) || (opc == 2 && opcionPC == 3) || (opc == 3 && opcionPC == 1)){
            System.out.println("Pierdes");
        }

    }

    public Integer getOpcion() {
        return opc;
    }

    public void setOpcion(Integer opcion) {
        this.opc = opcion;
    }

    public Integer getOpcionPC() {
        return opcionPC;
    }

    private void setOpcionPC() {
        this.opcionPC = (int) (Math.random() * 3 + 1);
    }
}



