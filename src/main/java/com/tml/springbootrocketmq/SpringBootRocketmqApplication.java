package com.tml.springbootrocketmq;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = "com.tml.springbootrocketmq.dao")
public class SpringBootRocketmqApplication {

	@Bean
	@ConfigurationProperties(prefix = "datasource")
	DataSource dataSourceBean() {
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRocketmqApplication.class, args);
	}
}
