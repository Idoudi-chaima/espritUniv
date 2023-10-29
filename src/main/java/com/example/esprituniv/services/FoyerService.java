package com.example.esprituniv.services;

import com.example.esprituniv.entities.Foyer;
import com.example.esprituniv.entities.Universite;
import com.example.esprituniv.repository.FoyerRepository;
import com.example.esprituniv.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FoyerService  implements IFoyerService {

    FoyerRepository foyerRepository;


    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepository.save(f);

    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepository.findById(idFoyer).get();
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }


    @Override
    public void archiverFoyer(long idFoyer) {

    }


}
