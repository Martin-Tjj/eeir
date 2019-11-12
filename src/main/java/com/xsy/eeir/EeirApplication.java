package com.xsy.eeir;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EeirApplication {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


/*	public void rtPostObject(){
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://esb.sipg.com.cn/ParaEsb/Token";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, String> map= new LinkedMultiValueMap<>();

		map.add("email", "844072586@qq.com");

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );

		System.out.println(response.getBody());


	}*/



}
