
package com.SpringConDB.SpringBoot.service;

import java.util.List;
import com.SpringConDB.SpringBoot.model.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import com.SpringConDB.SpringBoot.repository.ContactoRepository;
import org.springframework.stereotype.Service;


@Service
public class ContactoService implements IContactoService{

    @Autowired
    public ContactoRepository ContactRepo; 
    
    @Override
    public List<Contacto> verContacto() {
       return ContactRepo.findAll();
    }

    @Override
    public void crearContacto(Contacto cont) {
        ContactRepo.save(cont); //.save lo modifica si existe sino lo crea
    }

    @Override
    public void borrarContacto(Long id) {
        ContactRepo.deleteById(id);
    }

    @Override
    public Contacto buscarContacto(Long id) {
        return ContactRepo.findById(id).orElse(null);
    }


}