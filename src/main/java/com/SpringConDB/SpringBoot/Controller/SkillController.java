/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SpringConDB.SpringBoot.Controller;

import com.SpringConDB.SpringBoot.model.Skill;
import com.SpringConDB.SpringBoot.service.SkillService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins={"https://gervasoni-portfolio.web.app" , "http://localhost:4200"})
@RequestMapping("/api/skill")
public class SkillController {
     private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }
    
    @GetMapping("/id/{id}") //si traigo
    public ResponseEntity<Skill> obtenerSkill(@PathVariable("id") Long id){
        Skill skill = skillService.buscarSkillPorId(id);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }
    
    @PutMapping("/update") //cuando editamos,  PostMapping si añadimos 
    public ResponseEntity<Skill> editarSkill(@RequestBody Skill skill){
        Skill updateSkill=skillService.editarSkill(skill);
        return new ResponseEntity<>(updateSkill, HttpStatus.OK);
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Skill>> obtenerSkill(){
        List<Skill> educacion = skillService.buscarSkill();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Skill> crearSkill(@RequestBody Skill skill){
        Skill nuevaSkill = skillService.addSkill(skill);
        return new ResponseEntity<>(nuevaSkill, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable("id") Long id){
        skillService.borrarSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
