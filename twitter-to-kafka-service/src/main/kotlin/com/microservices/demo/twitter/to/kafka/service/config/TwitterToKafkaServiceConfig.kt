package com.microservices.demo.twitter.to.kafka.service.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix="twitter-to-kafka-service")
class TwitterToKafkaServiceConfig (
    val twitterKeywords: List<String>,
    val welcomeMessage:  List<String>
)