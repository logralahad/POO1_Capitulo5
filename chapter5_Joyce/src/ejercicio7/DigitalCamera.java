/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author logra
 */
public class DigitalCamera {
    
    private String marca;
    private Integer resolucion;
    private Integer precio;

    public DigitalCamera(String marca, Integer resolucion) {
        this.marca = marca;
        if(resolucion > 10){
            resolucion = 10;
        }
        this.resolucion = resolucion;
        setPrecio();
    }

    public String getMarca() {
        return marca;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setResolucion(Integer resolucion) {
        if(resolucion > 10){
            resolucion = 10;
        }
        this.resolucion = resolucion;
    }

    private void setPrecio() {
        if(this.resolucion <= 6){
            this.precio = 99;
        }
        else{
            this.precio = 129;
        }
    }
    
    public String detalles(){
        return String.format("\nMarca: %s\nResolucion: %d px\nPrecio: $%d\n", this.marca, this.resolucion, this.precio);
    }
    
}
