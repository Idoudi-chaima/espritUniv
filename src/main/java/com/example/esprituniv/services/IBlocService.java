package com.example.esprituniv.services;

import com.example.esprituniv.entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();

    Bloc updateBloc (Bloc bloc);

    Bloc addBloc (Bloc bloc);

    Bloc retrieveBloc (long idBloc);

    void archiverBloc (long idBloc); // ajouter un attribut boolean archived dans l'entité
   // Bloc, Par défault false et le modifier à true suite à l'exécution de ce service
}
