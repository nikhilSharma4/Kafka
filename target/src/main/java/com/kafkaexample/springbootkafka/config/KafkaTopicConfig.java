package com.kafkaexample.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }
}
