package org.fasttrackit.demoproducer.message;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TopicSender {

    private final RabbitTemplate template;
    private final FanoutExchange fanout;
    private int messageIndex;

    public TopicSender(RabbitTemplate template, FanoutExchange fanout) {
        this.template = template;
        this.fanout = fanout;
    }

    @Scheduled(fixedDelay = 2000, initialDelay = 500)
    public void send() {
        String message = "Sending newsletter to everyone!" + messageIndex++;
        this.template.convertAndSend(fanout.getName(), message);
        System.out.println(" [x] Sent '" + message + "'");
    }
}
