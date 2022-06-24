
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
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idPer;
    private String nombre;
    private String apellido;   
    
    public Persona(){ 
    }
    
    public Persona(Long idPer, String nombre, String apellido) {
        this.idPer = idPer;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    
}
