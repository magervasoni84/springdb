
package com.SpringConDB.SpringBoot.service;

import java.util.List;
import com.SpringConDB.SpringBoot.model.Persona;


public interface IPersonaService {
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
}