package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/test")
	public UserDto test() {
		UserDto userDto = new UserDto();
		userDto.setAge(31);
		userDto.setName("강하라");
		
		System.out.println("객체 정보 : " + userDto.toString());
		
		return userDto;
	}
}
