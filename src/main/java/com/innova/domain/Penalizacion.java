package com.innova.domain;



import javax.persistence.*;

@Entity
public class Penalizacion extends AbstractEntity {

    @Column(name = "MOTIVO")
    private String motivoPenalizacion;
    @Column(name = "MONTO")
    private int montoPenalizacion;

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

    public String getMotivoPenalizacion() {
        return motivoPenalizacion;
    }

    public void setMotivoPenalizacion(String motivoPenalizacion) {
        this.motivoPenalizacion = motivoPenalizacion;
    }

    public int getMontoPenalizacion() {
        return montoPenalizacion;
    }

    public void setMontoPenalizacion(int montoPenalizacion) {
        this.montoPenalizacion = montoPenalizacion;
    }
}
