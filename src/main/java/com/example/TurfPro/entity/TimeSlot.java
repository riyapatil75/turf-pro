package com.example.TurfPro.entity;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="time_slot")
public class TimeSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long turfId;

    private LocalDate slotDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private Boolean isAvailable;
}
