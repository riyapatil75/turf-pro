package com.example.TurfPro.controllers;
import com.example.TurfPro.entity.Turf;
import com.example.TurfPro.repository.TurfRepository;
import com.example.TurfPro.services.TurfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/turfs")
@CrossOrigin
public class TurfController {

    @Autowired
    private TurfService turfService;

    @GetMapping
    public List<Turf> getAllTurfs(){
        return turfService.getAllTurfs();
    }

    @PostMapping
    public Turf addTurf(@RequestBody Turf turf){
        return turfService.addTurf(turf);
    }

}