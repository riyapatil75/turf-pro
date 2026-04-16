package com.example.TurfPro.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Turf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long turfId;

    @NotBlank
    @Column(nullable = false)
    private String turfName;

    @NotBlank
    @Column(nullable = false)
    private String location;

    @NotNull
    @Column(nullable = false)
    private Double areaInMetres;

    @NotNull
    @Column(nullable = false)
    private Double pricePerHour;

    @NotBlank
    @Column(nullable = false)
    private String sportType;

    @NotBlank
    @Column(nullable = false)
    private String address;

    @org.jetbrains.annotations.NotNull
    @Column(nullable = false)
    private LocalTime openTime;

    @NotNull
    @Column(nullable = false)
    private LocalTime closeTime;

    @Column(length = 500)
    private String description;

    //  many Turf one Owner
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    // one Turf many Bookings
    @OneToMany(mappedBy = "turf", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}