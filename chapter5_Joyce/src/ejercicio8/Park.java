/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author logra
 */
public class Park {

    private String name;
    private Integer area;
    private Boolean picnic;
    private Boolean tennis;
    private Boolean patio;
    private Boolean piscina;

    public Park(String name, Integer acres, Boolean picnic, Boolean tennis, Boolean playground, Boolean pool) {
        this.name = name;
        if (acres > 400 || acres < 0) {
            System.out.println("Valor de acres no valido se asignara 0");
            this.area = 0;
        } else {
            this.area = acres;
        }
        this.picnic = picnic;
        this.tennis = tennis;
        this.patio = playground;
        this.piscina = pool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Boolean getPicnic() {
        return picnic;
    }

    public void setPicnic(Boolean picnic) {
        this.picnic = picnic;
    }

    public Boolean getTennis() {
        return tennis;
    }

    public void setTennis(Boolean tennis) {
        this.tennis = tennis;
    }

    public Boolean getPatio() {
        return patio;
    }

    public void setPatio(Boolean patio) {
        this.patio = patio;
    }

    public Boolean getPiscina() {
        return piscina;
    }

    public void setPiscina(Boolean piscina) {
        this.piscina = piscina;
    }

}
