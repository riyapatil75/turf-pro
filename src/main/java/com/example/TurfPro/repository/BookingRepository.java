package com.example.TurfPro.repository;

import com.example.TurfPro.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.ScopedValue;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByUserId(Long userId);

    List<Booking> findByTurfId(Long turfId);

    List<Booking> findByBookingDate(LocalDate bookingDate);

    List<Booking> findByTurfIdAndBookingDate(Long turfId, LocalDate bookingDate);

    Optional<Booking> findByTurfIdAndSlotIdAndBookingDate(
            Long turfId,
            Long slotId,
            LocalDate bookingDate
    );
}