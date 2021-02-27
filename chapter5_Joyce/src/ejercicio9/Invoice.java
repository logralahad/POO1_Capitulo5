/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author logra
 */
public class Invoice {

    private Integer factura;
    private Integer saldo;
    private Integer dia;
    private Integer mes;
    private Integer anio;

    public Invoice(Integer factura, Integer saldo, Integer dia, Integer mes, Integer anio) {
        if (factura < 1000) {
            this.factura = 0;
        } else {
            this.factura = factura;
        }        
        this.saldo = saldo;
        if(dia < 1 || dia > 31){
            this.dia = 0;
        }else{
            this.dia = dia;
        }
        if(mes < 1 || mes > 12){
            this.mes = 0;
        }else{
            this.mes = mes;
        }
        if(anio < 2011 || anio > 2017){
            this.anio = 0;
        }else{
            this.anio = anio;
        }
    }

    public Integer getFactura() {
        return factura;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void mostrar(){
        System.out.println("Factura numero " + this.getFactura());
        System.out.println(String.format("Saldo: %d\n Fecha: %d/%d/%d", this.getSaldo(),this.getDia(),this.getMes(),this.getAnio()));
    }
    

}
