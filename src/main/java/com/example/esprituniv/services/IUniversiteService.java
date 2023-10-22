package com.example.esprituniv.services;

import com.example.esprituniv.entities.Universite;
import java.util.List;
public interface IUniversiteService {
    List<Universite> retrieveAllUniversities();
    Universite addUniversity (Universite u);
    Universite updateUniversity (Universite u);
    Universite retrieveUniversity (long idUniversity);
    void removeUniversity  (long idUniversity );
}
