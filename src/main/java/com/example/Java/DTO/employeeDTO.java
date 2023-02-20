package com.example.Java.DTO;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class employeeDTO {
    Long department_id;
    String name;
    String phone;
    String email;
    int salary;

    public employeeDTO(String phone, String email) {
        this.phone=phone;
        this.email=email;
    }
}
