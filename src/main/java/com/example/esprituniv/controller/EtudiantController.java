package com.example.esprituniv.controller;

import com.example.esprituniv.entities.Etudiant;
import com.example.esprituniv.services.IEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;

    @GetMapping("/retrieve-all-etudiant")
    List<Etudiant> retrieveAllEtudiants(){
        List<Etudiant>listEtudiants=etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    };

    @PostMapping("/addetudiant")
        public Etudiant addEtudiant(@RequestBody Etudiant e) {
            Etudiant etudiant = etudiantService.addEtudiant(e);
            return etudiant;
    };

    @PutMapping("/updateetudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }



    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    @DeleteMapping("/remouve-etudiant/{etudiant-id}")
    void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId){

            etudiantService.removeEtudiant(etudiantId);
    };




}
