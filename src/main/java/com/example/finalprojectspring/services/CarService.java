package com.example.finalprojectspring.services;

import com.example.finalprojectspring.exceptions.CarNotFoundException;
import com.example.finalprojectspring.models.Branch;
import com.example.finalprojectspring.models.Car;

import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
public interface CarService {
    /**
     * To add a new car
     *
     * @param car Car
     */
    void addCar(Car car);

    /**
     * To find a car by ID
     *
     * @param id Car ID
     * @return Car
     */
    Car findCarById(Long id) throws CarNotFoundException;

    /**
     * To find a car by modelName
     *
     * @return Car
     */
    Car findCarByModelName(String name) throws CarNotFoundException;

    /**
     * To find all cars
     *
     * @return a list of Cars
     */
    List<Car> findAllCars();

    /**
     * To find all cars by branches
     *
     * @param branch Branch
     * @return a list of Cars
     */
    List<Car> findAllCarsByBranches(Branch branch);

    /**
     * To update an existing Cars
     *
     * @param car Car
     */
    void updateCar(Car car) throws CarNotFoundException;

    /**
     * To delete a Car by ID
     *
     * @param id Car ID
     */
    void deleteCarById(Long id) throws CarNotFoundException;

    /**
     * To restore a Car by ID
     *
     * @param id Car ID
     */
    void restoreCarById(Long id) throws CarNotFoundException;
}
