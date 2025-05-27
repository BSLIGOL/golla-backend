package com.golla.golla;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.golla.golla.dao")
public class GollaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GollaApplication.class, args);
	}

}
