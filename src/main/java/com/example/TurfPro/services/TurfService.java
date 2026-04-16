package com.example.TurfPro.services;

import com.example.TurfPro.entity.Turf;
import com.example.TurfPro.repository.TurfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurfService {

    @Autowired
    private TurfRepository turfRepository;

    public List<Turf> getAllTurfs(){
        return turfRepository.findAll();
    }

    public Turf addTurf(Turf turf){
        return turfRepository.save(turf);
    }
}