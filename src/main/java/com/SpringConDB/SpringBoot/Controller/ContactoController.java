
package com.SpringConDB.SpringBoot.Controller;

import com.SpringConDB.SpringBoot.model.Contacto;
import com.SpringConDB.SpringBoot.service.ContactoService;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins={"https://gervasoni-portfolio.web.app" , "http://localhost:4200"})
@RequestMapping("/api/contacto")

public class ContactoController {
    private final ContactoService contacServ;

    public ContactoController(ContactoService contacServ) {
        this.contacServ = contacServ;
    }
    
    @GetMapping("/id/{id}") //si traigo
    public ResponseEntity<Contacto> obtenerContacto(@PathVariable("id") Long id){
        Contacto contacto = contacServ.buscarContactoPorId(id);
    return new ResponseEntity<>(contacto, HttpStatus.OK);
    }
    
    
    @PostMapping ("/new")
    public void agregarContacto(@RequestBody Contacto id){
        contacServ.crearContacto(id);
    }
    
    @PutMapping("/update") //No estaria implemtendado en el Front 
    public ResponseEntity<Contacto> editarContacto(@RequestBody Contacto contacto){
        Contacto updateContacto=contacServ.editarContacto(contacto);
        return new ResponseEntity<>(updateContacto, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Contacto> crearEducacion(@RequestBody Contacto contacto){
        Contacto nuevoContacto = contacServ.addContacto(contacto);
    return new ResponseEntity<>(nuevoContacto, HttpStatus.OK);
    }

        
    @DeleteMapping("/delete/{id}")
    public void borrarContacto(@PathVariable Long id){
        contacServ.borrarContacto(id);
    }
        
    @GetMapping("/all")
    public ResponseEntity<List<Contacto>> obtenerContacto(){
        List<Contacto> contacto = contacServ.buscarContacto();
        return new ResponseEntity<>(contacto, HttpStatus.OK);
    }
}
