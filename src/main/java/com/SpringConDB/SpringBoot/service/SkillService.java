/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringConDB.SpringBoot.service;

import com.SpringConDB.SpringBoot.exception.UserNotFoundException;
import java.util.List;
import com.SpringConDB.SpringBoot.model.Skill;
import com.SpringConDB.SpringBoot.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class SkillService {
        private final SkillRepository skillRepository;
    
    @Autowired
    public SkillService(SkillRepository skillRepository){
        this.skillRepository = skillRepository;
    }
    
    public Skill addSkill(Skill skill){
        return skillRepository.save(skill);
    }
    
    public List<Skill> buscarSkill(){
        return skillRepository.findAll();
    }
    
    public Skill editarSkill(Skill skill){
        return skillRepository.save(skill);
    }
    
    public void borrarSkill(Long id){
        skillRepository.deleteById(id);
    }
    
    public Skill buscarSkillPorId(Long id){
        return skillRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Usuario no encontrado"));
    }
}
