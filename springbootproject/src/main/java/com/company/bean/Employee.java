package com.company.bean;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//Once you have added jpa dependency the entity class is mapped to the employee table in mysql using below annotations
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id  private String id;
    private String firstname;

}
