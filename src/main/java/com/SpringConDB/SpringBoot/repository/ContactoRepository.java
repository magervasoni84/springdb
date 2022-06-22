
package com.SpringConDB.SpringBoot.repository;

import com.SpringConDB.SpringBoot.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Long>{
    
}
