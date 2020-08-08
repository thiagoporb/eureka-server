package com.example.discovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@RefreshScope
@EnableEurekaServer
@SpringBootApplication
class EurekaServerApplication

fun main(args: Array<String>) {
	runApplication<EurekaServerApplication>(*args)
}
