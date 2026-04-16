package com.example.TurfPro.services;

import com.example.TurfPro.entity.Booking;
import com.example.TurfPro.repository.BookingRepository;
import com.example.TurfPro.repository.TimeSlotRepository;
import com.example.TurfPro.repository.TurfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private TurfRepository turfRepository;

    @Autowired
    private TimeSlotRepository slotRepository;

    @Autowired
    private BookingRepository bookingRepository;


    public Booking bookTurf(Booking booking){
        Optional<Booking> existing =
                bookingRepository.findByTurfIdAndSlotIdAndBookingDate(
                        booking.getTurfId(),
                        booking.getSlotId(),
                        booking.getBookingDate()
                );

        if(existing.isPresent()){
            throw new RuntimeException("Slot already booked");
        }

        booking.setStatus("CONFIRMED");

        return bookingRepository.save(booking);
    }

    public Booking getBookingById(Long id){
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
    }

    public List<Booking> getBookingsByUser(Long userId){
        return bookingRepository.findByUserId(userId);
    }

    public List<Booking> getBookingsByTurf(Long turfId){
        return bookingRepository.findByTurfId(turfId);
    }

    public List<Booking> getBookingsByDate(LocalDate date){
        return bookingRepository.findByBookingDate(date);
    }

    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }

    public Booking cancelBooking(Long bookingId){

        Booking booking = getBookingById(bookingId);
        booking.setStatus("CANCELLED");
        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long bookingId){
        bookingRepository.deleteById(bookingId);
    }

}