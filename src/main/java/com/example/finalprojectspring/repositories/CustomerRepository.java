package com.example.finalprojectspring.repositories;

import com.example.finalprojectspring.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Tiina Raudla
 * @Date
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByName(String name);

}
