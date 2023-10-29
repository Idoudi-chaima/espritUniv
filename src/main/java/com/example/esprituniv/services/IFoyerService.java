package com.example.esprituniv.services;

import com.example.esprituniv.entities.Foyer;
import com.example.esprituniv.entities.Universite;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);

    void removeFoyer( long idFoyer);
    void archiverFoyer (long idFoyer);  // ajouter un attribut boolean archived dans l'entité Foyer, Par défault false et le modifier à true suite à l'exécution de ce service


}
