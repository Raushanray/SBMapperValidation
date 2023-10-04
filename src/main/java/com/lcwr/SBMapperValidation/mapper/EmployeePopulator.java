package com.lcwr.SBMapperValidation.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.lcwr.SBMapperValidation.dto.EmployeeDto;
import com.lcwr.SBMapperValidation.entity.Employee;

@Mapper
public interface EmployeePopulator {
	

    EmployeePopulator INSTANCE = Mappers.getMapper(EmployeePopulator.class);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "creationDate", ignore = true)
    Employee populateEmployee(EmployeeDto employeeDto);
    
    

}
