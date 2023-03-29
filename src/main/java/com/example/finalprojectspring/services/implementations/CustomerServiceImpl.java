package com.example.finalprojectspring.services.implementations;

import com.example.finalprojectspring.exceptions.CustomerNotFoundException;
import com.example.finalprojectspring.models.Customer;
import com.example.finalprojectspring.repositories.CarRepository;
import com.example.finalprojectspring.repositories.CustomerRepository;
import com.example.finalprojectspring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void createCustomer(Customer customer) {

    }

    @Override
    public Customer findCustomerById(Long id) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public Customer findCustomerByLastName(String lastName) throws CustomerNotFoundException {
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) throws CustomerNotFoundException {

    }

    @Override
    public void deleteCustomerById(Long id) throws CustomerNotFoundException {

    }

    @Override
    public void restoreCustomerById(Long id) throws CustomerNotFoundException {

    }
}
