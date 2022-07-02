
package com.SpringConDB.SpringBoot.service;

import com.SpringConDB.SpringBoot.model.Educacion;
import com.SpringConDB.SpringBoot.repository.EducacionRepository;
import com.SpringConDB.SpringBoot.exception.UserNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepository educacionRepository;
    
    @Autowired
    public EducacionService(EducacionRepository educacionRepository){
        this.educacionRepository = educacionRepository;
    }
    
    public Educacion addEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    
    public List<Educacion> buscarEducacion(){
        return educacionRepository.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
        return educacionRepository.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        educacionRepository.deleteById(id);
    }
    
    public Educacion buscarEducacionPorId(Long id){
        return educacionRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"));
    }
    

}
