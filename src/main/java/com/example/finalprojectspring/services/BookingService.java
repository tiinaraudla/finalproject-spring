package com.example.finalprojectspring.services;

import com.example.finalprojectspring.exceptions.BookingNotFoundException;
import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.models.Booking;
import com.example.finalprojectspring.models.Branch;
import com.example.finalprojectspring.models.Car;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
@Service
public interface BookingService {
    /**
     * To add a new booking
     *
     * @param booking booking
     */
    void addBooking(Booking booking);

    /**
     * To find a booking by date of booking
     *
     * @param date of booking
     * @return Booking
     */
    Car findBookingByDateOfBooking(Long date) throws BookingNotFoundException;

    /**
     * To find a booking by client name
     *
     * @return booking
     */
    Car findBookingByClientName(String name) throws BookingNotFoundException;

    /**
     * To find all bookings
     *
     * @return a list of Bookings
     */
    List<Booking> findAllBookings();

    /**
     * To find all bookings by branches
     *
     * @param branch Branch
     * @return a list of bookings
     */
    List<Booking> findAllBookingsByBranches(Branch branch);

    /**
     * To update an existing Bookings
     *
     * @param booking Booking
     */
    void updateBooking(Booking booking) throws BookingNotFoundException;

    /**
     * To delete a Booking by date of booking
     *
     * @param date Booking date
     */
    void deleteBookingByDateOfBooking(Long date) throws BookingNotFoundException;

    /**
     * To restore a Booking by date
     *
     * @param date Booking date
     */
    void restoreBookingByDateOfBooking(Long date) throws BookingNotFoundException;
}