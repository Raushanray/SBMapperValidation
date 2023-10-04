package com.lcwr.SBMapperValidation.dto;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {
	
	
	private int id;
    private String name;
    private int age;
    private String emailAddress;
    private int projectId;


}
