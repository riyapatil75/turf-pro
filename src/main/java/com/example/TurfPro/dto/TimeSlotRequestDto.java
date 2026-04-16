package com.example.TurfPro.dto;
import lombok.Data;
import java.time.LocalDate;

@Data
public class TimeSlotRequestDto {

    private Long turfId;
    private LocalDate slotDate;

}