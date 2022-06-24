
package com.SpringConDB.SpringBoot.Controller;

import com.SpringConDB.SpringBoot.model.Contacto;
import com.SpringConDB.SpringBoot.service.IContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/contacto")
public class ContactoController {
    
    @Autowired
    private IContactoService contacServ;
    
    @PostMapping ("/new")
    public void agregarContacto(@RequestBody Contacto id){
        contacServ.crearContacto(id);
    }
    
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Contacto> verContacto(){
        return contacServ.verContacto();
    }
    
    
        @GetMapping("/id/{id}") //si traigo
    public ResponseEntity<Contacto> obtenerUsuario(@PathVariable("id") Long id){
        Contacto usuario = contacServ.buscarContactoPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarContacto(@PathVariable Long id){
        contacServ.borrarContacto(id);
    }
        
    
}
