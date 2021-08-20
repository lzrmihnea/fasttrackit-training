package org.fasttrackit.springdemo.configuration;

import org.fasttrackit.springdemo.controller.StudentController;
import org.fasttrackit.springdemo.model.Student;
import org.fasttrackit.springdemo.service.HumanService;
import org.fasttrackit.springdemo.service.SampleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SpringConfiguration {

    @Bean
    @Qualifier("sampleService1")
    public SampleService sampleService1() {
        return new SampleService();
    }

    @Bean
    @Primary
    public SampleService sampleService2() {
        return new SampleService();
    }

//    /**
//     * Method parameters are automatically injected by Spring, if they are Beans.
//     */
//    @Bean
//    public StudentController studentController(SampleService injectedService,
//                                               HumanService injectedHumanService) {
//        return new StudentController(injectedService, injectedHumanService);
//    }
}
