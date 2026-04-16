package com.example.TurfPro.dto;
import lombok.Data;

import java.time.LocalTime;

@Data
public class TurfDto {
        private Long turfId;
        private String turfName;
        private String location;
        private Double areaInMetres;
        private Double pricePerHour;
        private String sportType;
        private String address;
        private LocalTime openTime;
        private LocalTime closeTime;
        private String description;


    }

