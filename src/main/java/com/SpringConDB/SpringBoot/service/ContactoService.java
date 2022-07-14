
package com.SpringConDB.SpringBoot.service;

import java.util.List;
import com.SpringConDB.SpringBoot.model.Contacto;
import com.SpringConDB.SpringBoot.repository.ContactoRepository;
import com.SpringConDB.SpringBoot.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ContactoService {

    private final ContactoRepository ContactRepo; 
    
    @Autowired
    public ContactoService(ContactoRepository ContactRepo){
        this.ContactRepo = ContactRepo;
    }
    
    public List<Contacto> buscarContacto() {
       return ContactRepo.findAll();
    }

    public void crearContacto(Contacto idcont) {
        ContactRepo.save(idcont); //.save lo modifica si existe sino lo crea
    }
    
    public Contacto addContacto(Contacto contacto){
        return ContactRepo.save(contacto);
    }

  
    public void borrarContacto(Long idcont) {
        ContactRepo.deleteById(idcont);
    }
    
    public Contacto editarContacto(Contacto contacto){
    return ContactRepo.save(contacto);
    }
     
    public Contacto buscarContactoPorId(Long idcont){
      return ContactRepo.findById(idcont).orElseThrow(()-> new UserNotFoundException("Contacto no encontrado"));
    }

}