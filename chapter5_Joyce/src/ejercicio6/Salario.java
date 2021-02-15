/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Salario {

    private Integer skill;
    private Integer horas;
    private Integer extra_horas;
    private Double salario;
    private Double seguro;
    private Double jubilacion;
    private final Double level1 = 17.0;
    private final Double level2 = 20.0;
    private final Double level3 = 22.0;
    private final Double medical = 32.50;
    private final Double dental = 20.0;
    private final Double desability = 10.0;

    Scanner pen = new Scanner(System.in);

    public Salario(Integer nivel, Integer horas) {
        this.skill = nivel;
        this.horas = horas;
        if(horas>40){
            this.extra_horas = horas-40;}
        else{
            this.extra_horas = 0;
        }
        this.salario();
        this.jubilacion = 0.0;
    }

    private void salario() {
        switch (this.skill) {
            case 1:
                this.salario = (this.level1 * this.horas) + (this.level1 * 1.5 * this.extra_horas);
                break;
            case 2:
                this.salario = (this.level2 * this.horas) + (this.level2 * 1.5 * this.extra_horas);
                break;
            case 3:
                this.salario = (this.level3 * this.horas) + (this.level3 * 1.5 * this.extra_horas);
                break;
            default:
                this.seguro = 0.0;
                break;
        }
    }

    public void jubilacion(){
        if(this.skill == 3){
            System.out.println("Deseas agregar jubilacion plan [1]si   [0]no");
            int n = pen.nextInt();
            if(n == 1){
                this.jubilacion = this.salario*0.03;
            }
        }else{
            System.out.println("No tienes nivel para elegir jubilacion");
        }
    }
    public void seguro() {
        if (this.skill > 1) {
            System.out.println("Que seguro quieres:\n 1 Medical insurance 32.50\n"
                    + "2 Dental insurance 20.00\n"
                    + "3 Long-term disability insurance 10.00");
            int n = pen.nextInt();
            switch (n) {
                case 1:
                    this.seguro = medical;
                    break;
                case 2:
                    this.seguro = dental;
                    break;
                case 3:
                    this.seguro = desability;
                    break;
                default:
                    this.seguro = 0.0;
                    break;
            }
        } else {
            System.out.println("No tienes el nivel para elegir seguro");
            this.seguro = 0.0;
        }
    }

    public void getSalario(){
        Double sal = this.salario - this.jubilacion - this.seguro;
        if(sal > 0){
            System.out.println("Tu salario es:" + sal);
        }
        else{
            System.out.println("Datos erroneos");
        }
    }
}
