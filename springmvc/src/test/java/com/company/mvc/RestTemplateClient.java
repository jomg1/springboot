package com.company.mvc;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;

public class RestTemplateClient {

	@Test
	public void restTest() {
		RestTemplate rest = new RestTemplate();
		String url = "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230412";
		//String result = rest.getForObject(url, String.class); //변환할 변수 타입 : 문자로 받을거면 String.class, 아니라면 JsonNode.class
		JsonNode result = rest.getForObject(url, JsonNode.class);
		System.out.println(
				result.get("boxOfficeResult")
					  .get("dailyBoxOfficeList")
					  .get(0)
					  .get("movieNm"));
	}
}
