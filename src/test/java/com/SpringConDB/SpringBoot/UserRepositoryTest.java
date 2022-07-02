
package com.SpringConDB.SpringBoot;

import com.SpringConDB.SpringBoot.model.User;
import com.SpringConDB.SpringBoot.repository.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    UserRepository repo;
    
    @Test
    public void testCreateUser(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "Camilo30800806"; // Aca va el pass
        String encodePassword = passwordEncoder.encode(rawPassword);
        User newUser = new User("m@gmail.com", encodePassword); // Aca va el email con el que logueo
        User savedUser = repo.save(newUser);
        assertThat(savedUser).isNotNull();
   
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
    
}
