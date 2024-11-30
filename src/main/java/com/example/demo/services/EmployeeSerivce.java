package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeSerivce {


    String createEmployee(Employee employee);
    List<Employee> readEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
    Employee readEmployee(Long id);
    
}
