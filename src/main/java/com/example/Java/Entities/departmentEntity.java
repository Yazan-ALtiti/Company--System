package com.example.Java.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class departmentEntity {
    @Id
    @GeneratedValue
    Long id;
    @NonNull
    String name;
    @NonNull
    String officeNum;

    @OneToMany(mappedBy = "department")
    List<employeeEntity> employees;

}
