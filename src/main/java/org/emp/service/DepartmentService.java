package org.emp.service;

import org.emp.dto.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);

    List<Department> getAllDepartments();
}
