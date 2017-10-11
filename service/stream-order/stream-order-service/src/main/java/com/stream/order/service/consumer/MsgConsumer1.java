package com.stream.order.service.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MsgConsumer1 {

    /**
     * 监听test主题,有消息就读取
     * @param message
     */
    @KafkaListener(topics = {"lihongwei1239"})
    @KafkaHandler()
    public void consumer(String message){
        log.info("test1 topic message : {}", message);
    }


}
