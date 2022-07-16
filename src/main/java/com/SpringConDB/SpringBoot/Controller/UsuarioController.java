
package com.SpringConDB.SpringBoot.Controller;

import com.SpringConDB.SpringBoot.model.Usuario;
import com.SpringConDB.SpringBoot.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"https://gervasoni-portfolio.web.app" , "http://localhost:4200"})
@RequestMapping("gervasoni-portfolio.herokuapp.com/api/usuario")


public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @GetMapping("/id/{id}") //si traigo
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
        Usuario usuario = usuarioService.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @PutMapping("/update") //cuando editamos  PostMapping si añadimos 
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updateUsuario=usuarioService.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Usuario> crearEducacion(@RequestBody Usuario usuario){
        Usuario nuevaEducacion = usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(nuevaEducacion, HttpStatus.OK);
    }
}
