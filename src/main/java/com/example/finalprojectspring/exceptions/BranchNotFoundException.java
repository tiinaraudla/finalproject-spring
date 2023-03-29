package com.example.finalprojectspring.exceptions;

/**
 * @author Tiina Raudla
 * @Date
 */
public class BranchNotFoundException extends Exception{
    private static final long serialVersionUID = 1L;

    public BranchNotFoundException(Long id) {
        super(String.format("Branch not found for id: %d", id));
    }
    public BranchNotFoundException (String address) {
        super(String.format("Branch not found for address: %s", address));
    }
}
