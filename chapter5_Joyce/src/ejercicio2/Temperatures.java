/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author logra
 */
public class Temperatures {
    
    private Integer temp_alta;
    private Integer temp_baja;

    public Temperatures(Integer temp_alta, Integer temp_baja) {
        this.temp_alta = temp_alta;
        this.temp_baja = temp_baja;
    }

    public Integer getTemp_alta() {
        return temp_alta;
    }

    public void setTemp_alta(Integer temp_alta) {
        this.temp_alta = temp_alta;
    }

    public Integer getTemp_baja() {
        return temp_baja;
    }

    public void setTemp_baja(Integer temp_baja) {
        this.temp_baja = temp_baja;
    }
    
    public void diffTemperatures(){
        if( (this.temp_alta - this.temp_baja) > 40 )
            System.out.println("Large temperature swing."); 
        
        if(this.temp_alta >= 90){
            System.out.println("Heat warning");
        }
        else if(this.temp_baja < 32)
            System.out.println("Freeze warning");
        else
            System.out.println("Nice weather.");
    }
}
