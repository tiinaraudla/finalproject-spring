package com.example.finalprojectspring.repositories;

import com.example.finalprojectspring.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

/**
 * @author Tiina Raudla
 * @Date
 */
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByModelName(String modelName);
}
