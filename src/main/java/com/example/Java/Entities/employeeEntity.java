package com.example.Java.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class employeeEntity {
    @Id
    @GeneratedValue
    Long id;
    @NonNull
    String name;
    @NonNull
    String phone;
    @NonNull
    String email;
    @NonNull
    int salary;
    @OneToMany(mappedBy = "employee")
    List<enrollmentEntity> enrollments;

    @ManyToOne
    @JoinColumn(name = "department_id")
    departmentEntity department;

}
