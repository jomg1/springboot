package com.company.mvc.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.mvc.emp.mapper.DeptVO;
import com.company.mvc.emp.mapper.EmpMapper;

@RestController // ajax 사용 rest컨트롤은 모든 메소드가 핸들러를 포함하고 있음 @ResponseBody 포함
public class EmpController {

	@Autowired
	EmpMapper empMapper;
	
	@GetMapping("/getDept")
	public List<DeptVO> getDepat() {
		return empMapper.getDeptList();
	}
	
	@PostMapping("/deptInsert")
	public DeptVO deptInsert(@RequestBody DeptVO vo) {//@RequestBody의 경우 json 형식으로 보내야 함
		return vo;
	}
}
