package com.lcwr.SBMapperValidation.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwr.SBMapperValidation.dto.EmployeeDto;
import com.lcwr.SBMapperValidation.entity.Employee;
import com.lcwr.SBMapperValidation.mapper.EmployeePopulator;
import com.lcwr.SBMapperValidation.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
    EmployeeRepo employeeRepo;

    public Employee saveEmployee(EmployeeDto employeeDto){
        //code to convert dto to entity
            Employee employee = EmployeePopulator.INSTANCE.populateEmployee(employeeDto);
            employee.setCreationDate(new Date());
       return employeeRepo.save(employee);
    }

}
