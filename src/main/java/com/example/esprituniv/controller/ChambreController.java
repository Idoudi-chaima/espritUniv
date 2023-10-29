package com.example.esprituniv.controller;

import com.example.esprituniv.entities.Chambre;
import com.example.esprituniv.services.IChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService ;
    @GetMapping("/retrieveAllChambres")
    public List<Chambre> retrieveAllChambres(){
        List<Chambre> chambreList = chambreService.retrieveAllChambres();
        return chambreList;
    }
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c){
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }
    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre c){
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }

    @GetMapping("/retrieveChambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable ("chambre-id") Long idChambre){
        Chambre chambre = chambreService.retrieveChambre(idChambre);
        return  chambre;
    }



}
