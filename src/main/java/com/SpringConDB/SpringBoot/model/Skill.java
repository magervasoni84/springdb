
package com.SpringConDB.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idsk;
    private String nombreSk;
    private String fotoSk;
    private int porcentSk;

    public Skill() {
    }

    public Skill(Long idsk, String nombreSk, String fotoSk, int porcentSk) {
        this.idsk = idsk;
        this.nombreSk = nombreSk;
        this.fotoSk = fotoSk;
        this.porcentSk = porcentSk;
    }

    public Long getIdsk() {
        return idsk;
    }

    public void setIdsk(Long idsk) {
        this.idsk = idsk;
    }

    public String getNombreSk() {
        return nombreSk;
    }

    public void setNombreSk(String nombreSk) {
        this.nombreSk = nombreSk;
    }

    public String getFotoSk() {
        return fotoSk;
    }

    public void setFotoSk(String fotoSk) {
        this.fotoSk = fotoSk;
    }

    public int getPorcentSk() {
        return porcentSk;
    }

    public void setPorcentSk(int porcentSk) {
        this.porcentSk = porcentSk;
    }

    


}


