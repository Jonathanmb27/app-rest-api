package com.innova.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Contrato extends AbstractEntity {

    @Column(name = "FECHA")
    private LocalDate fechaContrato;

    @Column(name = "ESTADO")
    @Enumerated(EnumType.ORDINAL)
    private EstadoAI estadoAI;

    @OneToOne
    @JoinColumn(name = "SERVICIOS_ID",nullable = false)
    private  Servicios servicios;

    @OneToOne
    @JoinColumn(name = "GARANTIA_ID", nullable = false)
    private Garantia garantia;

    @OneToOne
    @JoinColumn(name = "HABITACION_ID", nullable = false)
    private Habitacion habitacion;

    @OneToMany(mappedBy = "contrato")
    private List<FechaContrato> fechaContratoList;

    @OneToMany(mappedBy = "contrato")
    private List<Penalizacion> penalizacionList;

    @OneToOne(mappedBy = "contrato")
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

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }



    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    public Garantia getGarantia() {
        return garantia;
    }

    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public List<FechaContrato> getFechaContratoList() {
        return fechaContratoList;
    }

    public void setFechaContratoList(List<FechaContrato> fechaContratoList) {
        this.fechaContratoList = fechaContratoList;
    }

    public List<Penalizacion> getPenalizacionList() {
        return penalizacionList;
    }

    public void setPenalizacionList(List<Penalizacion> penalizacionList) {
        this.penalizacionList = penalizacionList;
    }
}
