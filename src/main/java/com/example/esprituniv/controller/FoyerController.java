package com.example.esprituniv.controller;

import com.example.esprituniv.entities.Foyer;
import com.example.esprituniv.services.IFoyerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;

    @GetMapping("/retrieveAllFoyers")
    List<Foyer> retrieveAllFoyers(){
        List<Foyer>foyerList=foyerService.retrieveAllFoyers();
        return foyerList;
    }
    @PostMapping("addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f){
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }

    @PutMapping("updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f){
        Foyer foyer =  foyerService.updateFoyer(f);
        return foyer;
    }
    @GetMapping("/retrieveFoyer/{foyer-id}")
        public Foyer retrieveFoyer(@PathVariable ("foyer-id") Long idFoyer){
        return  foyerService.retrieveFoyer(idFoyer);
    }
    @DeleteMapping ("/archiverFoyer/{foyer-id}")
     void archiverFoyer(@PathVariable("foyer-id") Long idFoyer){
        foyerService.archiverFoyer(idFoyer);
    }

}
