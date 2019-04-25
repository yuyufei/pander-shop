package com.pander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.pander.user.mapper")
public class PanderUserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanderUserCenterApplication.class, args);
	}

}
