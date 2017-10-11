package com.stream.order;

import com.stream.order.service.producer.MsgProducer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigurationProperties
@EnableRedisHttpSession
@MapperScan("com.stream.order.mapper")
@EnableScheduling
public class Application {

	@Autowired
	private MsgProducer msgProducer;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//然后每隔1分钟执行一次
	@Scheduled(fixedRate = 1000 * 30)
	public void testKafka() throws Exception {
		msgProducer.sendTest();
	}
}
