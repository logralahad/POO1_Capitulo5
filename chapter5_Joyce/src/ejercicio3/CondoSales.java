/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author logra
 */
public class CondoSales {
    
    private Integer condo;
    private Integer precio;

    public CondoSales(Integer condo) {
        this.condo = condo;
        this.precio = setPrecio(condo);
    }

    public Integer getCondo() {
        return condo;
    }

    public void setCondo(Integer condo) {
        this.condo = condo;
    }

    public Integer getPrecio() {
        return precio;
    }

    private int setPrecio(Integer precio) {
        switch (precio) {
            case 1:
                this.precio = 150000;
                break;
                
            case 2:
                this.precio = 170000;
                break;
                        
            case 3:
                this.precio = 210000;
                break;
                
            default:
                this.precio = 0;
        }
        
        return this.precio;
    }
    
    public String toString(){
        return String.format("Precio del condominio: $%d", this.precio);
    }
    
}
