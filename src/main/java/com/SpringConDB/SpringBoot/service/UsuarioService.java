
package com.SpringConDB.SpringBoot.service;

import java.util.List;
import com.SpringConDB.SpringBoot.model.Usuario;
import com.SpringConDB.SpringBoot.repository.UsuarioRepository;
import com.SpringConDB.SpringBoot.exception.UserNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
        
    public Usuario addUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    
    public List<Usuario> buscarUsuario(){
        return usuarioRepository.findAll();
    }
    
    public Usuario editarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    
    public void borrarUsuario(Long id){     //Por logica el usuario no deberia ser borrado
        usuarioRepository.deleteById(id);
    }
    
    public Usuario buscarUsuarioPorId(Long id){   
        return usuarioRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"));
    }
}
