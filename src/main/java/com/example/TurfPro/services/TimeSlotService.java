package com.example.TurfPro.services;


import com.example.TurfPro.dto.TimeSlotRequestDto;
import com.example.TurfPro.entity.TimeSlot;
import com.example.TurfPro.repository.TimeSlotRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class TimeSlotService {

    private final TimeSlotRepository repository;

    public TimeSlotService(TimeSlotRepository repository) {
        this.repository = repository;
    }

    public void generateSlots(TimeSlotRequestDto request) {

        LocalTime start = LocalTime.of(6, 0);
        LocalTime end = LocalTime.of(23, 0);

        while (start.isBefore(end)) {

            TimeSlot slot = TimeSlot.builder()
                    .turfId(request.getTurfId())
                    .slotDate(request.getSlotDate())
                    .startTime(start)
                    .endTime(start.plusHours(1))
                    .isAvailable(true)
                    .build();

            repository.save(slot);

            start = start.plusHours(1);
        }
    }

    public List<TimeSlot> getSlots(Long turfId, String date) {

        return repository.findByTurfIdAndSlotDate(
                turfId,
                LocalDate.parse(date)
        );
    }
}