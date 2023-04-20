package com.company.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.app.emp.EmpVO;
import com.company.app.emp.mapper.EmpMapper;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;
	
	@GetMapping("/empList")
	public String empList(Model model){
		List<EmpVO> list = empMapper.getEmpList();
		model.addAttribute("list", list);
		return "empList";
	}

}
