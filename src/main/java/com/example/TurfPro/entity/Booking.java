package com.example.TurfPro.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
            name = "bookings",
            uniqueConstraints = {
                    @UniqueConstraint(
                            columnNames = {"turf_id","slot_id","booking_date"}
                    )
            }
    )
    public class Booking {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false)
        private User user;


        @NotNull
        @Column(name="turf_id", nullable=false)
        private Long turfId;


        @NotNull
        @Column(nullable = false)
        private Long slotId;


        @NotNull
        @Column(name="booking_date", nullable=false)
        private LocalDate bookingDate;


        @PositiveOrZero
        @Column(nullable = false)
        private double totalAmount;


        @NotBlank
        @Column(nullable = false)
        private String status;


        @Column(nullable = false, updatable = false)
        private LocalDate createdDate;


        @PrePersist
        public void prePersist() {
            this.createdDate = LocalDate.now();
        }
}