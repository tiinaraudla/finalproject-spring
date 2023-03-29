package com.example.finalprojectspring.exceptions;

/**
 * @author Tiina Raudla
 * @Date
 */
public class CustomerNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomerNotFoundException(Long id) {
        super(String.format("Customer not found for id: %d", id));
    }
    public CustomerNotFoundException (String name) {
        super(String.format("Customer not found for lastName: %s", name));
    }
}
