package com.innova.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class FechaContrato extends AbstractEntity {

    @Column(name = "INICIO")
    private LocalDate fechaInicio;
    @Column(name = "FIN")
    private LocalDate fechaFin;


    @Column(name = "ESTADO")
    @Enumerated(EnumType.ORDINAL)
    private EstadoAI estadoAI;

    @ManyToOne
    private Contrato contrato;

    public EstadoAI getEstadoAI() {
        return estadoAI;
    }

    public void setEstadoAI(EstadoAI estadoAI) {
        this.estadoAI = estadoAI;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


}
