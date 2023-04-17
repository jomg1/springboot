package com.company.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.app.temp.mapper.TempMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/config/*-context.xml")
public class TempMapperClient {
	@Autowired TempMapper tempMapper;
	@Test
	public void getDate() {
		String date = tempMapper.getDate();
		System.out.println(date);
	}

}
