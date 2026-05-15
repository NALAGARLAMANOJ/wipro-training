package com.company.controller;

import com.company.bean.Employee;
import com.company.repo.EmployeeRepo;
import com.company.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("empapi")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
//    public String addEmployee(@RequestBody Employee employee) {
//
//             employeeService.createEmployee(employee);
//            return "Employee added successfully";
//
//
//    }

    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {


        Employee emp = employeeService.createEmployee(employee);
        return new ResponseEntity<>(emp, HttpStatus.OK);


    }





    @GetMapping("/all")
    public ResponseEntity<List<Employee>> viewAllEmployees() {

        List<Employee> employees = employeeService.viewAllEmployees();

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


    @GetMapping("/view/{id}")
    public ResponseEntity<Employee> viewEmployee(@PathVariable Integer id) {

        Employee emp = employeeService.viewEmployee(id);

        if (emp != null) {
            return new ResponseEntity<>(emp, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Integer id) {

        employeeService.deleteEmployee(id);

        return new ResponseEntity<>("The id is deleted successfully", HttpStatus.OK);
    }


//    @PutMapping("/update/{id}")
//    public ResponseEntity<String> updateEmployee(@PathVariable Integer id,
//                                                 @RequestBody Employee employee) {
//
//        Employee emp = employeeService.updateEmployee(id, employee);
//
//        return new ResponseEntity<>("The data is updated successfully", HttpStatus.OK);
//    }

}g
