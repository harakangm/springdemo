package com.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok라이브러리를 이용해서 사용하는 어노테이션
@Getter
@Setter
@ToString
public class UserDto {
	private String name;
	private int age;
}
