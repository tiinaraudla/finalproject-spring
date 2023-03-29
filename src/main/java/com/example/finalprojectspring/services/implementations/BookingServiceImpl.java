package com.example.finalprojectspring.services.implementations;

import com.example.finalprojectspring.exceptions.BookingNotFoundException;
import com.example.finalprojectspring.models.Booking;
import com.example.finalprojectspring.models.Branch;
import com.example.finalprojectspring.models.Car;
import com.example.finalprojectspring.repositories.BookingRepository;
import com.example.finalprojectspring.repositories.CarRepository;
import com.example.finalprojectspring.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;
    @Override
    public void addBooking(Booking booking) {

    }

    @Override
    public Car findBookingByDateOfBooking(Long date) throws BookingNotFoundException {
        return null;
    }

    @Override
    public Car findBookingByClientName(String name) throws BookingNotFoundException {
        return null;
    }

    @Override
    public List<Booking> findAllBookings() {
        return null;
    }

    @Override
    public List<Booking> findAllBookingsByBranches(Branch branch) {
        return null;
    }

    @Override
    public void updateBooking(Booking booking) throws BookingNotFoundException {

    }

    @Override
    public void deleteBookingByDateOfBooking(Long date) throws BookingNotFoundException {

    }

    @Override
    public void restoreBookingByDateOfBooking(Long date) throws BookingNotFoundException {

    }
}
