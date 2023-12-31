package com.example.esprituniv.controller;

import com.example.esprituniv.entities.Foyer;
import com.example.esprituniv.entities.Universite;
import com.example.esprituniv.services.IFoyerService;
import com.example.esprituniv.services.IUniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    IUniversiteService universiteService;
    IFoyerService foyerService;

    @GetMapping("/retrieveAllUniversities")
    public List<Universite> retrieveAllUniversities() {
        List<Universite> universiteList = universiteService.retrieveAllUniversities();
        return universiteList;

    }

    @PostMapping("/addUniversity")
    public Universite addUniversity(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversity(u);
        return universite;
    }

    @PutMapping("/updateUniversity")
    public Universite updateUniversity(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversity(u);
        return universite;
    }

    @GetMapping("/retrieveUniversity/{universite-id}")
    public Universite retrieveUniversity(@PathVariable("universite-id") Long idUniversite) {
        return universiteService.retrieveUniversity(idUniversite);
    }

    @DeleteMapping("/removeUniversity/{universite-id}")
    void removeUniversity(@PathVariable("universite-id") Long idUniversite) {
        universiteService.removeUniversity(idUniversite);
    }

    @PutMapping("/affecterFoyerAUniversite/{idFoyer}/{nomUniversite}")
    @ResponseBody
    public Universite affecterFoyerAUniversite(@PathVariable("idFoyer") long idFoyer, @PathVariable("nomUniversite") String nomUniversite){
        Universite universite=universiteService.affecterFoyerAUniversite(idFoyer,nomUniversite);
        return universite;
    }
}
