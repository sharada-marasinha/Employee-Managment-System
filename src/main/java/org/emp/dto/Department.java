package org.emp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.emp.entity.EmployeeEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Department {
    private Long id;
    private String name;
    private String description;

    private Employee employee;
}
