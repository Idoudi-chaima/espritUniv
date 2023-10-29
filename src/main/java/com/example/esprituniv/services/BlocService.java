package com.example.esprituniv.services;

import com.example.esprituniv.entities.Bloc;
import com.example.esprituniv.repository.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService {
    BlocRepository blocRepository;
    @Override
    public List<Bloc> retrieveBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepository.findById(idBloc).get();
    }

    @Override
    public void archiverBloc(long idBloc) {

    } //AFAIRE!!!!!!!!!!!!!!!
}
