package com.innova.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Garantia extends AbstractEntity {

    @Column(name = "MONTO",nullable = false)
    private int montoGarantia;

    public int getMontoGarantia() {
        return montoGarantia;
    }

    public void setMontoGarantia(int montoGarantia) {
        this.montoGarantia = montoGarantia;
    }
}
