package com.microservices.demo.twitter.to.kafka.service.runner

import com.microservices.demo.config.TwitterToKafkaServiceConfig
import com.microservices.demo.twitter.to.kafka.service.listener.TwitterKafkaStatusListener
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import twitter4j.FilterQuery
import twitter4j.TwitterStreamFactory
import javax.annotation.PreDestroy

@Component
class TwitterKafkaStreamRunner(
    private val twitterToKafkaServiceConfig: TwitterToKafkaServiceConfig,
    private val twitterKafkaStatusListener: TwitterKafkaStatusListener
) : StreamRunner {
    private val LOG: Logger = LoggerFactory.getLogger(TwitterKafkaStreamRunner::class.java)

    private val twitterStream = TwitterStreamFactory().instance

    override fun start() {
        twitterStream.addListener(twitterKafkaStatusListener)
        addFilter()
    }

    @PreDestroy
    fun shutDown(){
        LOG.info("Closing twitter stream!")
        twitterStream?.shutdown()
    }

    private fun addFilter() {
        val keywords: List<String> = twitterToKafkaServiceConfig.twitterKeywords
        val filterQuery = FilterQuery()
        twitterStream.filter(filterQuery)
        LOG.info("Started filtering twitter stream for keywords$keywords")
    }
}