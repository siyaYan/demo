package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Mybatis配置文件中会指定 数据库相关的参数，
exclude={DataSourceAutoConfiguration.class},
让spring-boot不要根据Maven中依赖自动配置了。
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
