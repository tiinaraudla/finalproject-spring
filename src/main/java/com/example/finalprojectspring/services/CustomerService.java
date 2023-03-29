package com.example.finalprojectspring.services;

import com.example.finalprojectspring.exceptions.CustomerNotFoundException;
import com.example.finalprojectspring.models.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
@Service
public interface CustomerService {
    /**
     * To create a new customer
     *
     * @param customer Customer
     */
    void createCustomer(Customer customer);

    /**
     * To find a customer by ID
     *
     * @param name Customer ID
     * @return Customer
     */
    Customer findCustomerByName(Long name) throws CustomerNotFoundException;

    /**
     * To find a customer by name
     *
     * @param lastName Customer lastName
     * @return Customer
     */
    Customer findCustomerByLastName(String lastName) throws CustomerNotFoundException;

    /**
     * To find all customers
     *
     * @return a list of customer
     */
    List<Customer> findAllCustomers();

    /**
     * To update an existing Customer
     *
     * @param customer Customer
     */
    void updateCustomer(Customer customer) throws CustomerNotFoundException;

    /**
     * To delete a Customer by ID
     *
     * @param id Customer ID
     */
    void deleteCustomerById(Long id) throws CustomerNotFoundException;

    /**
     * To restore a Customer by ID
     *
     * @param id Customer ID
     */
    void restoreCustomerById(Long id) throws CustomerNotFoundException;
}
