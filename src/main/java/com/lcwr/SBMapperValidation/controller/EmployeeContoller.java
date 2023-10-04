package com.lcwr.SBMapperValidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwr.SBMapperValidation.dto.EmployeeDto;
import com.lcwr.SBMapperValidation.entity.Employee;
import com.lcwr.SBMapperValidation.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeContoller {
	
	@Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<Employee>(employeeServiceImpl.saveEmployee(employeeDto), HttpStatus.CREATED);
    }

}
