/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author logra
 */
public class Coffee {
    
    private Integer opcion;
    private Double precio;

    public Coffee() {
        this.opcion = 0;
        this.precio = 0.00;
    }

    public Integer getOpcion() {
        return opcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setOpcion(Integer opcion) {
        this.opcion = opcion;
        setPrecio();
    }

    private void setPrecio() {
        switch (opcion) {
            case 1:
                this.precio += 1.99;
                break;
            
            case 2:
                this.precio += 2.50;
                break;
            
            case 3:
                this.precio += 2.15;
                break;
                
            default:
                this.precio += 0;
        }
    }
    
    public String precioTotal(){
        return String.format("Cuenta total: $%.2f", this.precio);
    }
    
    public static void menuCafe(){
        System.out.println("\n---------------------");
        System.out.println("(0) Salir del menu $0");
        System.out.println("(1) American    $1.99");
        System.out.println("(2) Espresso    $2.50");
        System.out.println("(3) Latte       $2.15");
        System.out.println("---------------------\n");
    }
    
}
