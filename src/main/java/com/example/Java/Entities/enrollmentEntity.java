package com.example.Java.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class enrollmentEntity {
    @Id
    @GeneratedValue
    Long id;

    @NonNull
    String start;
    @NonNull
    String leaving;
    @NonNull
    String date;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "employee_id")
    employeeEntity employee;

}
