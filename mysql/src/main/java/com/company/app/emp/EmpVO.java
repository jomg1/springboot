package com.company.app.emp;

import java.util.Date;

import lombok.Data;
@Data
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	int salary;
	Date hireDate;

}
