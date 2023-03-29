package com.example.finalprojectspring.controllers;

import com.example.finalprojectspring.models.Booking;
import com.example.finalprojectspring.models.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
@RestController
@RequestMapping("/api/booking")
public class BookingController {
    private List<Booking> bookings = new ArrayList<>();
    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings() {
        return ResponseEntity.ok(bookings);
    }
    @GetMapping("/{date}")
    public ResponseEntity<Booking> getBookingByDateOfBooking(@PathVariable Long date) {
        Booking booking = findBookingByDateOfBooking(date);
        if (booking != null) {
            return ResponseEntity.ok(booking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) {
        booking.setDateOfBooking(String.valueOf((long) (bookings.size() + 1)));
        bookings.add(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(booking);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Booking> updateBooking (@PathVariable Long date, @RequestBody Booking bookingUpdates) {
        Booking booking = findBookingByDateOfBooking(date);
        if (booking != null) {
            booking.setDateOfBooking(bookingUpdates.getDateOfBooking());
            booking.setClient(bookingUpdates.getClient());
            booking.setCar(bookingUpdates.getCar());
            booking.setDateFrom(bookingUpdates.getDateFrom());
            booking.setDateTo(bookingUpdates.getDateTo());
            booking.setRentalBranch(bookingUpdates.getRentalBranch());
            booking.setReturnBranch(bookingUpdates.getReturnBranch());
            booking.setAmount(bookingUpdates.getAmount());
            return ResponseEntity.ok(booking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{date}")
    public ResponseEntity<Void> deleteBooking (@PathVariable Long date) {
        Booking booking = findBookingByDateOfBooking(date);
        if (booking != null) {
            bookings.remove(booking);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    private Booking findBookingByDateOfBooking(Long date) {
        for (Booking booking : bookings) {
            if (booking.getDateOfBooking().equals(date)) {
                return booking;
            }
        }
        return null;
    }

}
