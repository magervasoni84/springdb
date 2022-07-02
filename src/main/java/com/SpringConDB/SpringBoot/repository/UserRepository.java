
package com.SpringConDB.SpringBoot.repository;

import com.SpringConDB.SpringBoot.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String Email);
    
    
}
