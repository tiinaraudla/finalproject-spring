package com.example.finalprojectspring.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Branch extends AudiTable<String> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String address;   //address with the city
    @ManyToOne(cascade = CascadeType.MERGE)
    private List<Employee> specializedEmployees;
    @ManyToOne(cascade = CascadeType.MERGE)
    private List<Car> specializedCars;
}
