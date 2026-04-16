package com.example.TurfPro.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TimeSlotResponseDto {
    private Long slotId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Boolean available;
}
