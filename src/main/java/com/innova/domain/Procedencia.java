package com.innova.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Procedencia extends AbstractEntity {

    @Column(name = "REGION")
    private String region;
    @Column(name = "DISTRITO")
    private String  distrito;
    @Column(name = "PROVINCIA")
    private String provincia;
    @Column(name = "PAIS")
    private String pais;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
