package com.innova.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Cancelado extends AbstractEntity{

    @Column(name = "MONTO")
    private int montoCancelado;

    @Column(name = "FECHA")
    private LocalDate fechaCancelado;

    @ManyToOne
    private Inquilino inquilino;

    public int getMontoCancelado() {
        return montoCancelado;
    }

    public void setMontoCancelado(int montoCancelado) {
        this.montoCancelado = montoCancelado;
    }

    public LocalDate getFechaCancelado() {
        return fechaCancelado;
    }

    public void setFechaCancelado(LocalDate fechaCancelado) {
        this.fechaCancelado = fechaCancelado;
    }
}
