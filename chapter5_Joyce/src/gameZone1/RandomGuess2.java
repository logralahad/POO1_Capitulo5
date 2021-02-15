/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameZone1;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class RandomGuess2 {
    Scanner sc = new Scanner(System.in);
    private Integer aleatorio;
    private Integer prediccion;

    public void iniciar(){
        setAleatorio();
        System.out.println(getAleatorio());
        prediccion = sc.nextInt();
        if (prediccion == getAleatorio()){
            System.out.println("Correcto");
        }else{
            if (prediccion >  getAleatorio()){
                System.out.printf("Demasiado alto");
            }else{
                System.out.println("Demasiado baja");
            }
        }
    }

    public Integer getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio() {
        this.aleatorio =  (int)(Math. random()*10+1);
    }

    public Integer getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(Integer prediccion) {
        this.prediccion = prediccion;
    }
}
