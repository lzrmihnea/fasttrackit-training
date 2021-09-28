package org.fasttrackit.demoproducer.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    // 1. Worker Consumer
    @Bean
    public Queue hello() {
        return new Queue("queue-01");
    }

    // 2. Topics (Publish & Subscribe)
    @Bean public FanoutExchange fanout() { return new FanoutExchange("fanout.demo");}

    @Bean public Queue forTopic1() { return new Queue("topic-queue-01");}

    @Bean public Queue forTopic2() { return new Queue("topic-queue-02"); }

    @Bean
    public Binding topicBinding1(FanoutExchange fanout, Queue forTopic1) {
        return BindingBuilder.bind(forTopic1).to(fanout);
    }
    @Bean
    public Binding topicBinding2(FanoutExchange fanout, Queue forTopic2) {
        return BindingBuilder.bind(forTopic2).to(fanout);
    }
}
