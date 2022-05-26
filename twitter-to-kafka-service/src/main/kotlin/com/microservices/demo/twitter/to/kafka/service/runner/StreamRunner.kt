package com.microservices.demo.twitter.to.kafka.service.runner

import twitter4j.TwitterException

interface StreamRunner {
    @Throws(TwitterException::class)
    fun start()
}