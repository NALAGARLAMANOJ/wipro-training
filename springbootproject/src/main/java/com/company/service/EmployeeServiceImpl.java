package com.company.service;

import com.company.bean.Employee;
import com.company.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    // Create Employee
    @Override
    public Employee createEmployee(Employee employee) {

        return employeeRepo.save(employee);
    }

    // View All Employees
    @Override
    public List<Employee> viewAllEmployees() {

        return employeeRepo.findAll();
    }

    // View Employee By Id
    @Override
    public Employee viewEmployee(Integer id) {

        return employeeRepo.findById(id).orElse(null);
    }

    // Delete Employee
    @Override
    public void deleteEmployee(Integer id) {

        employeeRepo.deleteById(id);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }


//    @Override
//    public Employee updateEmployee(Integer id, Employee employee) {
//
//        Employee emp = employeeRepo.findById(id).orElse(null);
//
//        if (emp != null) {
//
//            emp.setName(employee.getName());
//            emp.setSalary(employee.getSalary());
//            emp.setDepartment(employee.getDepartment());
//
//            return employeeRepo.save(emp);
//        }
//
//        return null;
//    }
//
}