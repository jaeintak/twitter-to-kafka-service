package com.microservices.demo.twitter.to.kafka.service

import com.microservices.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfig
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class Application(
    private val config: TwitterToKafkaServiceConfig
) : CommandLineRunner {

    private val LOG: Logger = LoggerFactory.getLogger(Application::class.java)

    override fun run(vararg args: String?) {
        LOG.info("App starts...")
        LOG.info(config.twitterKeywords.toString())
        LOG.info(config.welcomeMessage.toString())
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}