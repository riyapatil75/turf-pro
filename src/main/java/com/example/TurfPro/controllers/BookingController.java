package com.example.TurfPro.controllers;
import com.example.TurfPro.entity.Booking;
import com.example.TurfPro.repository.BookingRepository;
import com.example.TurfPro.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking bookTurf(@RequestBody Booking booking){
        return bookingService.bookTurf(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBooking(@PathVariable Long id){
        return bookingService.getBookingById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Booking> getUserBookings(@PathVariable Long userId){
        return bookingService.getBookingsByUser(userId);
    }

    @GetMapping("/turf/{turfId}")
    public List<Booking> getTurfBookings(@PathVariable Long turfId){
        return bookingService.getBookingsByTurf(turfId);
    }

    @GetMapping("/date/{date}")
    public List<Booking> getBookingsByDate(@PathVariable String date){

        LocalDate bookingDate = LocalDate.parse(date);

        return bookingService.getBookingsByDate(bookingDate);
    }

    @PutMapping("/cancel/{id}")
    public Booking cancelBooking(@PathVariable Long id){
        return bookingService.cancelBooking(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Long id){

        bookingService.deleteBooking(id);

        return "Booking deleted successfully";
    }

}