package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 해당 어노테이션 하나가 @EnableAutoConfiguration, @ComponentScan, @Configuration을 하나로 묶어 놓은 거라고 볼 수 있다.
// 해당 annotation을 설정한 클래스가 있는 package를 최상위 패키지로 인식하고 ComponentScan을 수행하기 때문에 해당 어노테이션이 있는 클래스의 파일 위치또한 중요하다.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//스프링부트를 기동하기 위해서는 main 메소드가 필요한데 여기에SpringApplication.run(BoApplication.class, args); 이 부분이 들어 간다.
	}

}
