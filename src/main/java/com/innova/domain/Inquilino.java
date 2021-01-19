package com.innova.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Inquilino extends AbstractEntity{

    @Column(name = "NOMBRE")
    private String nombreInquilino;
    @Column(name = "APELLIDO")
    private String apellidoInquilino;
    @Column(name = "DOCUMENTO")
    private int documentoInquilino;
    @Column(name = "TELEFONO")
    private int telefonoInquilino;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "ESTADO")
    private EstadoAI estadoAI;

    /*
    * PODRIA SER UNA ENNUMERACION
    * */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "TIPO_DOCUMENTO")
    private TipoDocumento tipoDocumento;

    @OneToOne
    @JoinColumn(name = "PROCEDECNIA_ID",nullable = false)
    private Procedencia procedencia;

    /*
    * page 87
    * */
    @OneToMany(mappedBy = "inquilino")
    /*@CollectionTable(name = "INQUILINO_DEUDA",
        joinColumns ={@JoinColumn(name = "INQUILINO_ID")})*/
    private List<Deuda> deuda=new ArrayList<>();


    @OneToMany(mappedBy = "inquilino")
    private List<Cancelado> cancelado;

    @OneToOne
    @JoinColumn(name = "TRABAJO_ID", nullable = false)
    private Trabajo trabajo;

    @OneToOne
    @JoinColumn(name = "CONTRATO_ID")
    private Contrato contrato;

    public String getNombreInquilino() {
        return nombreInquilino;
    }

    public void setNombreInquilino(String nombreInquilino) {
        this.nombreInquilino = nombreInquilino;
    }

    public String getApellidoInquilino() {
        return apellidoInquilino;
    }

    public void setApellidoInquilino(String apellidoInquilino) {
        this.apellidoInquilino = apellidoInquilino;
    }

    public int getDocumentoInquilino() {
        return documentoInquilino;
    }

    public void setDocumentoInquilino(int documentoInquilino) {
        this.documentoInquilino = documentoInquilino;
    }

    public int getTelefonoInquilino() {
        return telefonoInquilino;
    }

    public void setTelefonoInquilino(int telefonoInquilino) {
        this.telefonoInquilino = telefonoInquilino;
    }

    public com.innova.domain.EstadoAI getEstadoAI() {
        return estadoAI;
    }

    public void setEstadoAI(com.innova.domain.EstadoAI estadoAI) {
        this.estadoAI = estadoAI;
    }

    public com.innova.domain.TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(com.innova.domain.TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public com.innova.domain.Procedencia getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(com.innova.domain.Procedencia procedencia) {
        this.procedencia = procedencia;
    }

    public List<com.innova.domain.Deuda> getDeuda() {
        return deuda;
    }

    public void setDeuda(List<com.innova.domain.Deuda> deuda) {
        this.deuda = deuda;
    }

    public List<com.innova.domain.Cancelado> getCancelado() {
        return cancelado;
    }

    public void setCancelado(List<com.innova.domain.Cancelado> cancelado) {
        this.cancelado = cancelado;
    }

    public com.innova.domain.Trabajo getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(com.innova.domain.Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    public com.innova.domain.Contrato getContrato() {
        return contrato;
    }

    public void setContrato(com.innova.domain.Contrato contrato) {
        this.contrato = contrato;
    }
}
