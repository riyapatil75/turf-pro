package com.example.TurfPro.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class BookingResponseDto {

        private Long bookingId;
        private LocalDate bookingDate;
        private LocalTime startTime;
        private LocalTime endTime;
        private Double totalAmount;

        private String userName;
        private String turfName;


    }
