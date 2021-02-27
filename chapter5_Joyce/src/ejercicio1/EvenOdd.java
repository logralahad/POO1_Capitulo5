/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author logra
 */
public class EvenOdd {
    
    private Integer numero;
    private Boolean odd;

    public EvenOdd(Integer numero) {
        this.numero = numero;
        if(numero % 2 == 0)
            this.odd = false;
        else 
            this.odd = true;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
        setOdd();
    }

    public Boolean getOdd() {
        return odd;
    }

    private void setOdd() {
        if(this.numero % 2 == 0)
            this.odd = false;
        else 
            this.odd = true;
    }
    
    public String isOdd(){
        if(odd == true)
            return String.format("%d es impar", this.numero);
        else
            return String.format("%d es par", this.numero);
    }  
    
    
}
