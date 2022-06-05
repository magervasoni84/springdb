
package com.SpringConDB.SpringBoot.repository;

import com.SpringConDB.SpringBoot.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
