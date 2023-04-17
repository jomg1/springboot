package co.comp.boot;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.comp.boot.temp.mapper.TempMapper;
import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TempMapperClient {
	@Autowired TempMapper tempMapper;
	
	@Test
	public void getDate() {
		Date date = tempMapper.getDate();
		log.debug(date);
	}
	
}
