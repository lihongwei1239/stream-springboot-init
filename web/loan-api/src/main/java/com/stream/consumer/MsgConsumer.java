package com.stream.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MsgConsumer {

    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"lihongwei1239"})
    public void consumer(String message){
        log.info("loan-api:test topic message : {}", message);
    }


}
