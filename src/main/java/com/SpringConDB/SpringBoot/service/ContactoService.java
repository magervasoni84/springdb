
package com.SpringConDB.SpringBoot.service;

import java.util.List;
import com.SpringConDB.SpringBoot.model.Contacto;
import com.SpringConDB.SpringBoot.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import com.SpringConDB.SpringBoot.repository.ContactoRepository;
import exception.UserNotFoundException;
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
    public void crearContacto(Contacto idcont) {
        ContactRepo.save(idcont); //.save lo modifica si existe sino lo crea
    }

    @Override
    public void borrarContacto(Long idcont) {
        ContactRepo.deleteById(idcont);
    }

    @Override
    public Contacto buscarContacto(Long idcont) {
        return ContactRepo.findById(idcont).orElse(null);
    }
    
    @Override
    public Contacto buscarContactoPorId(Long idcont){
      return ContactRepo.findById(idcont).orElseThrow(()-> new UserNotFoundException("Contacto no encontrado"));
    }

}