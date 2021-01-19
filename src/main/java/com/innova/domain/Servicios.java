package com.innova.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Servicios extends AbstractEntity {
    @Column(name = "LUZ")
    private int pagoLuz;
    @Column(name = "AGUA")
    private int pagoAgua;
    @Column(name = "INTERNET")
    private int pagoInternet;

    public int getPagoLuz() {
        return pagoLuz;
    }

    public void setPagoLuz(int pagoLuz) {
        this.pagoLuz = pagoLuz;
    }

    public int getPagoAgua() {
        return pagoAgua;
    }

    public void setPagoAgua(int pagoAgua) {
        this.pagoAgua = pagoAgua;
    }

    public int getPagoInternet() {
        return pagoInternet;
    }

    public void setPagoInternet(int pagoInternet) {
        this.pagoInternet = pagoInternet;
    }
}
