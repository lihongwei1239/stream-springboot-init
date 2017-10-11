package com.stream.order.config;

import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/dubbo.properties")
@ImportResource("classpath:dubbo-provide.xml")
public class DubboConfig {
}
