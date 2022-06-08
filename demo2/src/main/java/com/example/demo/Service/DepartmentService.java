package com.example.demo.Service;

import com.example.demo.Model.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    void saveDepartment(Department department);
}
