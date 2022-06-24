
package com.SpringConDB.SpringBoot.repository;

import com.SpringConDB.SpringBoot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
