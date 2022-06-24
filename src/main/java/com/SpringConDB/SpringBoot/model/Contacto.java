
package com.SpringConDB.SpringBoot.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Contacto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long idcont;
    private String nombre;
    private String email;
    private String texto;
    
    public Contacto(){
    }
    
    public Contacto(Long idcont, String nombre, String email, String texto){
        this.idcont = idcont;
        this.nombre = nombre;
        this.email = email;
        this.texto = texto;
    }   
}