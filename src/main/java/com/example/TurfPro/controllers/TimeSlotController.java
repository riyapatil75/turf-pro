package com.example.TurfPro.controllers;

import com.example.TurfPro.dto.TimeSlotRequestDto;
import com.example.TurfPro.entity.TimeSlot;
import com.example.TurfPro.services.TimeSlotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timeslots")
public class TimeSlotController {

    private final TimeSlotService service;

    public TimeSlotController(TimeSlotService service) {
        this.service = service;
    }

    @PostMapping("/generate")
    public String generateSlots(@RequestBody TimeSlotRequestDto request) {

        service.generateSlots(request);

        return "Slots generated successfully";
    }

    @GetMapping
    public List<TimeSlot> getSlots(
            @RequestParam Long turfId,
            @RequestParam String date) {

        return service.getSlots(turfId, date);
    }
}