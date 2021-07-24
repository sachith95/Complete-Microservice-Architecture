package com.microservices.one.twitter.to.kafka.service;


import com.microservices.one.config.TwitterToKafkaServiceConfigData;
import com.microservices.one.twitter.to.kafka.service.runner.StreamRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;


@SpringBootApplication
@ComponentScan(basePackages = "com.microservices.one")
public class TwitterToKafkaService implements CommandLineRunner {

    private  static  final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaService.class);
    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;
    private final StreamRunner streamRunner;

    public TwitterToKafkaService(TwitterToKafkaServiceConfigData configData,
                                 StreamRunner runner){
        this.twitterToKafkaServiceConfigData = configData;
        this.streamRunner = runner;
    }
    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaService.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
       LOG.info("App starts.....");
       LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
       LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
       streamRunner.start();
    }
}
