
package Controller;


//import java.util.ArrayList;
import java.util.List;
import model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.IPersonaService;

@RestController
public class Controller {  
    /* 
    Usado como ejemplo
    List<Persona> listaPersona = new ArrayList();
    
    @GetMapping("/Hola/{nombre}/{apellido}/{edad}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable String apellido,
                            @PathVariable int edad)
    {
        return "Hola Mundo " + nombre + " Apellido: "+ apellido + " Edad: "+ edad;
    }
    
    @GetMapping("/Chau")
    public String decirChau(@RequestParam String nombre,
                            @RequestParam String apellido,
                            @RequestParam int edad){
        return "Chau Mundo" + nombre + " Apellido: "+ apellido + " Edad: "+ edad;
    }
    */
    
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        persoServ.crearPersona(pers);

//listaPersona.add(pers);
    }
    
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersonas();
        //return listaPersona;
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
}
