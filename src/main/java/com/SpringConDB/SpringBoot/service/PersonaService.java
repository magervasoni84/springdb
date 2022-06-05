
package com.SpringConDB.SpringBoot.service;

import java.util.List;
import com.SpringConDB.SpringBoot.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import com.SpringConDB.SpringBoot.repository.PersonaRepository;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository persoRepo; 
    
    @Override
    public List<Persona> verPersonas() {
       return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per); //.save lo modifica si existe sino lo crea
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
}
