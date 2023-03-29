package com.example.finalprojectspring.components;

/**
 * @author Tiina Raudla
 * @Date
 */
import com.example.finalprojectspring.exceptions.BookingNotFoundException;
import com.example.finalprojectspring.exceptions.BranchNotFoundException;
import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.exceptions.CustomerNotFoundException;
import com.example.finalprojectspring.models.*;
import com.example.finalprojectspring.services.BookingService;
import com.example.finalprojectspring.services.BranchService;
import com.example.finalprojectspring.services.CarService;
import com.example.finalprojectspring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;

@Component
public class DataInit {
    @Autowired
    private CarService carService;

    @Autowired
    private BookingService bookingService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BranchService branchService;

    @PostConstruct
    public void init() {
        initCar();
        initBooking();
        initCustomer();
        initBranch();
    }
        private void initCar() {
            System.out.println("Starting cars initialization...");
            Car car = new Car();
            car.setModelName("Ford");
            car.setColor("black");
            car.setBodyType("sedan");
            car.setYearOfProd(2023);
            car.setMileage(15000);
            car.setAmount(2);
            car.setBooked(false);

            try {
                Car searchCar = carService.findCarByModelName(car.getModelName());
                System.out.println("Cannot pre-initialize car: " + car.getModelName());
            } catch (CarNotFoundException e) {
                carService.addCar(car);
            }
        }
    private void initCustomer() {
        System.out.println("Starting customer initialization...");

        try {
            Customer customer = customerService.findCustomerByName(Long.valueOf("name"));

            customer = new Customer();
            customer.setName("Jaanus Rool");
            customer.setEmail("jaanusrool@online.ee");
            customer.setAddress("Pikk 47, Tallinn");

            try {
                Customer searchCustomer = customerService.findCustomerByLastName(customer.getName());
                System.out.println("Cannot pre-initialize customer: " + customer.getName());
            } catch (CustomerNotFoundException e) {
                customerService.createCustomer(customer);
            }

        } catch (CustomerNotFoundException e) {
            System.out.println("Cannot pre-initialize customer! Reason:  " + e.getLocalizedMessage());
        }
    }
    private void initBooking() {
        System.out.println("Starting booking initialization...");

        try {
            Booking booking = bookingService.findBookingByDateOfBooking;

            Booking booking = new Booking();
            booking.setDateOfBooking("23.03.2023");
            booking.setListCustomer();
            booking.setListCar();
            booking.setDateFrom("01.04.2023");
            booking.setDateTo("03.04.2023");
            booking.setListBranch("Tallinn");
            booking.setReturnBranch("Tallinn");
            booking.setAmount(150);

            try {
                Booking searchBooking = bookingService.findBookingByDateOfBooking(Long.valueOf(String).getDateOfBooking());
                System.out.println("Cannot pre-initialize booking: " + booking.getDateOfBooking());
            } catch (BookingNotFoundException e) {
                bookingService.addBooking(booking);
            }

        } catch (BookingNotFoundException e) {
            System.out.println("Cannot pre-initialize booking! Reason:  " + e.getLocalizedMessage());
        }
    }
    private void initBranch() {
        System.out.println("Starting branch initialization...");
        Branch branch = new Branch();
        branch.setAddress("Ülemiste 78, Tallinn");
        branch.setListOfOfficeEmployees(Collections.singletonList());
        branch.setListOfCurrentlyAvailableCars(Collections.singletonList(Car));

        try {
            Branch searchBranch = branchService.findBranchByAddress(branch.getAddress());
            System.out.println("Cannot pre-initialize branch: " + branch.getAddress());
        } catch (BranchNotFoundException e) {
            branchService.createBranch(branch);
        }
    }
}
