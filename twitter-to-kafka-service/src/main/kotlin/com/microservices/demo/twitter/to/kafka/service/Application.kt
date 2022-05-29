package com.microservices.demo.twitter.to.kafka.service

import com.microservices.demo.config.TwitterToKafkaServiceConfig
import com.microservices.demo.twitter.to.kafka.service.runner.TwitterKafkaStreamRunner
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(basePackages = ["com.microservices.demo"])
class Application(
    private val config: TwitterToKafkaServiceConfig,
    private val runner: TwitterKafkaStreamRunner,
) : CommandLineRunner {

    private val LOG: Logger = LoggerFactory.getLogger(Application::class.java)

    override fun run(vararg args: String?) {
        LOG.info("App starts...")
        LOG.info(config.twitterKeywords.toString())
        LOG.info(config.welcomeMessage.toString())
        runner.start()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}