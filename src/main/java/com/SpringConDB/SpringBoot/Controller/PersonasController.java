
package com.SpringConDB.SpringBoot.Controller;


//import java.util.ArrayList;
import java.util.List;
import com.SpringConDB.SpringBoot.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.SpringConDB.SpringBoot.service.IPersonaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/persona")
public class PersonasController {  

    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    
    @GetMapping("/ver")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersonas();
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }

}
