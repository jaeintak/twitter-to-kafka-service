//package com.microservices.demo.twitter.to.kafka.service.runner
//
//import com.microservices.demo.config.TwitterToKafkaServiceConfig
//import com.microservices.demo.twitter.to.kafka.service.listener.TwitterKafkaStatusListener
//import org.slf4j.Logger
//import org.slf4j.LoggerFactory
//import org.springframework.stereotype.Component
//
//@Component
//class MockKafkaStreamRunner(
//    private val twitterToKafkaServiceConfig: TwitterToKafkaServiceConfig,
//    private val twitterKafkaStatusListener: TwitterKafkaStatusListener
//) : StreamRunner {
//    private val LOG: Logger = LoggerFactory.getLogger(MockKafkaStreamRunner::class.java)
//    override fun start() {
//        TODO("Not yet implemented")
//    }
//}