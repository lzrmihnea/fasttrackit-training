package org.fasttrackit.democonsumer.message;

import org.fasttrackit.democonsumer.service.CalculationService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = "queue-01")
public class QueueConsumerService {
    private final CalculationService calculationService;

    public QueueConsumerService(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
        this.calculationService.calculate(in);
    }
}
