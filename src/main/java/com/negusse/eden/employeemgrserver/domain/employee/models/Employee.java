package com.negusse.eden.employeemgrserver.domain.employee.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity //JPA to save to the db
@NoArgsConstructor //generates non-arg constructor
@RequiredArgsConstructor //parameterized constructor
@Data //generates getters and setters
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String email;

    public  String toString(){
        return String.format("%d %s %s %s", id, firstName, lastName, email);
    }

}
