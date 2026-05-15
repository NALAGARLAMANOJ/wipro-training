package com.company.service;

import com.company.bean.Employee;

import com.company.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import com.company.bean.Employee;

import java.util.List;


public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    //public Employee updateEmployee(Integer id , Employee employee);
    public void deleteEmployee(Integer id);
    public Employee getEmployeeById(Integer id);
    public List<Employee> getAllEmployees();
    Employee saveEmployee(Employee employee);


    List<Employee> viewAllEmployees();


    Employee viewEmployee(Integer id);


}