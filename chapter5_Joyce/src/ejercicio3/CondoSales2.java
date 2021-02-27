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
public class CondoSales2 {
    
    private Integer condo;
    private Integer precio;
    private Integer garage;

    public CondoSales2(Integer condo, Integer garage) {
        this.condo = condo;
        this.precio = setPrecio(condo);
        this.garage = setGarage(garage);
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

    public Integer getGarage() {
        return garage;
    }

    public int setGarage(Integer garage) {
        if(precio == 0)
            return 0;
        else
            switch (garage) {
                case 1:
                    this.garage = 5000;
                    break;

                case 2:
                    this.garage = 5000;
                    break;

                default:
                    this.garage = 0;
            }
        
        return this.garage;
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
        return String.format("Precio del condominio: $%d\nPrecio con garage: $%d\n", this.precio, this.precio + this.garage);
    }
}
