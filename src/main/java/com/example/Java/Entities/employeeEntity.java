package com.example.Java.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @NonNull
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "department_id")
    departmentEntity department;

}
