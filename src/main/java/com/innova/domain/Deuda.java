package com.innova.domain;

import javax.persistence.*;

@Entity
public class Deuda extends AbstractEntity {

    @Column(name = "DIAS_VENCIDOS")
    private int diasVencidos;
    @Column(name = "MESES_VENCIDOS")
    private int mesesVencidos;
    @Column(name = "CANTIDAD")
    private int cantidadDeuda;
    @Column(name = "MES")
    private String mesDeuda;

    @Column(name = "ESTADO_DEUDA")
    @Enumerated(EnumType.ORDINAL)
    private EstadoAI estadoAI;

    @ManyToOne
    private Inquilino inquilino;

    public EstadoAI getEstadoAI() {
        return estadoAI;
    }

    public void setEstadoAI(EstadoAI estadoAI) {
        this.estadoAI = estadoAI;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public int getDiasVencidos() {
        return diasVencidos;
    }

    public void setDiasVencidos(int diasVencidos) {
        this.diasVencidos = diasVencidos;
    }

    public int getMesesVencidos() {
        return mesesVencidos;
    }

    public void setMesesVencidos(int mesesVencidos) {
        this.mesesVencidos = mesesVencidos;
    }

    public int getCantidadDeuda() {
        return cantidadDeuda;
    }

    public void setCantidadDeuda(int cantidadDeuda) {
        this.cantidadDeuda = cantidadDeuda;
    }

    public String getMesDeuda() {
        return mesDeuda;
    }

    public void setMesDeuda(String mesDeuda) {
        this.mesDeuda = mesDeuda;
    }
}
