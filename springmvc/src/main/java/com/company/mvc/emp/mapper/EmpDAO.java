package com.company.mvc.emp.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAO {
	//mapper interface 대신 직접 생성하는 작업.

	@Autowired
	SqlSession mybatis;
	
	public List<Map<String,Object>> getEmpList(){
									//실행할 패키지명, 인터페이스명, 메소드명 //myBatis mapper name space를 지정하여 작업 해줌 Repository bean으로 등록.
		return mybatis.selectList("com.company.mvc.emp.mapper.EmpMapper.getEmpList");
	}
	
	public Map<String,Object> getEmp(int value){
		return mybatis.selectOne("com.company.mvc.emp.mapper.EmpMapper.getEmp");
	}
}
