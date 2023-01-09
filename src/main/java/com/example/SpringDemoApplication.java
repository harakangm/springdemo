//가장먼저실행되는곳 시작
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + @ResponseBody 서블릿에서 컨트롤러와 응답을 같이 합친거같은
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	
	@GetMapping(value = "/") //경로를 맵핑해주는 어노테이션
	public String Helloworld() {
		return "Hello world!";
	}
	
	
}
