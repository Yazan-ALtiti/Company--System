package com.example.Java.Entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
//    @OneToMany(mappedBy = "employee")
//    List<enrollmentEntity>enrollments;

}
