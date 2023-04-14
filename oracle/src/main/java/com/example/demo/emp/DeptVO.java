package com.example.demo.emp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DeptVO {
	String departmentId;
	//@JsonProperty("dname")// 출력을 원하는 이름으로 하고싶을 때(jackson)
	String departmentName;
	String managerId;
	String locationId;
	@JsonIgnore // 출력값에서 제외하고 싶을 때 붙이는 어노테이션
	List<String> departmentIds; 
	@JsonIgnore
	List<EmpVO> emps;
}
