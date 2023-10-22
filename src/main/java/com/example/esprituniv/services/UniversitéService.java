package com.example.esprituniv.services;

import com.example.esprituniv.entities.Universite;
import com.example.esprituniv.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversitéService implements IUniversiteService{
    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return null;
    }

    @Override
    public Universite addUniversity(Universite u) {
        return null;
    }

    @Override
    public Universite updateUniversity(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversity(long idUniversity) {
        return null;
    }

    @Override
    public void removeUniversity(long idUniversity) {

    }
}
