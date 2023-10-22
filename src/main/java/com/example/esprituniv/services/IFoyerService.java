package com.example.esprituniv.services;

import com.example.esprituniv.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);
    void archiverFoyer (long idFoyer);  // ajouter un attribut boolean archived dans l'entité Foyer, Par défault false et le modifier à true suite à l'exécution de ce service
}
