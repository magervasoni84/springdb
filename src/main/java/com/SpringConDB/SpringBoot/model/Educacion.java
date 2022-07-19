
package com.SpringConDB.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private int fechaEdu;
    private String descEdu;
    private String imagenEdu;
    private String MasInfoEdu;
    private Boolean MasInfoBoolEdu;

    public Educacion() {
        
    }

    public void setMasInfoBoolEdu(Boolean MasInfoBoolEdu) {
        this.MasInfoBoolEdu = MasInfoBoolEdu;
    }

    
    public Educacion(Long idEdu, String tituloEdu, int fechaEdu, String descEdu, String imagenEdu, String MasInfoEdu, Boolean MasInfoBoolEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
        this.MasInfoEdu = MasInfoEdu;
        this.MasInfoBoolEdu = MasInfoBoolEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
    
    
    public String getMasInfoEdu() {
        return MasInfoEdu;
    }

    public void setMasInfoEdu(String MasInfoEdu) {
        this.MasInfoEdu = MasInfoEdu;
    }

    public Boolean getMasInfoBoolEdu() {
        return MasInfoBoolEdu;
    }

    
}
