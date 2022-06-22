
package com.SpringConDB.SpringBoot.Controller;


//import java.util.ArrayList;
import com.SpringConDB.SpringBoot.model.Contacto;
import java.util.List;
import com.SpringConDB.SpringBoot.model.Persona;
import com.SpringConDB.SpringBoot.model.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringConDB.SpringBoot.service.IPersonaService;
import com.SpringConDB.SpringBoot.service.IContactoService;


@RestController
public class Controller {  

    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }

    
    
    
    
    
    @Autowired
    private IContactoService contacServ;
    
    @PostMapping ("/contacto/new")
    public void agregarContacto(@RequestBody Contacto contac){
        contacServ.crearContacto(contac);
    }
    
    
    @GetMapping("/contacto/ver")
    @ResponseBody
    public List<Contacto> verContacto(){
        return contacServ.verContacto();
    }
    
    @DeleteMapping("/contacto/delete/{id}")
    public void borrarContacto(@PathVariable Long id){
        contacServ.borrarContacto(id);
    }
        
    
}
