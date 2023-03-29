package com.example.finalprojectspring.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Auditable model
 *
 * @author Tiina Raudla
 * @Date
 * @implNote This model can be extended to any entity which needs auditing
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Car extends AudiTable<String> implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String modelName;
    private String color;
    private String bodyType;

    private int yearOfProd;
    private int mileage;
    private int amount;
    private  boolean isBooked;

}