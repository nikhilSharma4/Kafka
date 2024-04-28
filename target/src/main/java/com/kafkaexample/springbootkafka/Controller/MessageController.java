package com.kafkaexample.springbootkafka.Controller;

import com.kafkaexample.springbootkafka.kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    private KafkaProducer kafkaProcuder;

    public MessageController(KafkaProducer kafkaProcuder){
        this.kafkaProcuder = kafkaProcuder;
    }

    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){
        this.kafkaProcuder.sendMessage(message);
        return ResponseEntity.ok("Message Send to Topic");
    }

}
