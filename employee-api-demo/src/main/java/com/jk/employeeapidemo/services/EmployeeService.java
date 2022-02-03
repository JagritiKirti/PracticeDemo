package com.jk.employeeapidemo.services;

import java.util.List;

import com.jk.employeeapidemo.entities.Employee;

public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}