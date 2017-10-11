package com.stream.open.api.config;

import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/dubbo.properties")
@ImportResource("classpath:dubbo-comsumer.xml")
public class DubboConfig {
}
