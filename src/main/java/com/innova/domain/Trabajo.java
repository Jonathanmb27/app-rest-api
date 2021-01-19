package com.innova.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Trabajo extends AbstractEntity{

    @Column(name = "RUBRO")
    private String rubroTrabajo;
    @Column(name = "DIRECCION")
    private String direccionTrabajo;
    @Column(name = "TELEFONO")
    @NotNull(groups = BasicValidation.class)
    private String telefonoTrabajo;

    public String getRubroTrabajo() {
        return rubroTrabajo;
    }

    public void setRubroTrabajo(String rubroTrabajo) {
        this.rubroTrabajo = rubroTrabajo;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }
    public interface BasicValidation{}
}
