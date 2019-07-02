package com.weichuang.pinduoduo_rd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.weichuang.pinduoduo_rd.dao")
public class PinduoduoRdApplication {

	public static void main(String[] args) {
		SpringApplication.run(PinduoduoRdApplication.class, args);
	}

}
