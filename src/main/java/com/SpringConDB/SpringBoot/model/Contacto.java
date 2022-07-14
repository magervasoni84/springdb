
package com.SpringConDB.SpringBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Contacto{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long idcont;
    private String nombrecont;
    private String emailcont;
    private String textocont;
    
    public Contacto(){
    }
    
    public Contacto(Long idcont, String nombrecont, String emailcont, String textocont){
        this.idcont = idcont;
        this.nombrecont = nombrecont;
        this.emailcont = emailcont;
        this.textocont = textocont;
    }   

    public Long getIdcont() {
        return idcont;
    }

    public void setIdcont(Long idcont) {
        this.idcont = idcont;
    }

    public String getNombrecont() {
        return nombrecont;
    }

    public void setNombrecont(String nombrecont) {
        this.nombrecont = nombrecont;
    }

    public String getEmailcont() {
        return emailcont;
    }

    public void setEmailcont(String emailcont) {
        this.emailcont = emailcont;
    }

    public String getTextocont() {
        return textocont;
    }

    public void setTextocont(String textocont) {
        this.textocont = textocont;
    }    
}
