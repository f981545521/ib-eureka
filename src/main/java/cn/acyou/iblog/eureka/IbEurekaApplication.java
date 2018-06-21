package cn.acyou.iblog.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IbEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbEurekaApplication.class, args);
	}
}
