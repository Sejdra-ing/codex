package org.cloudchallenge.codex.security

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class SecurityApplication

fun main(args: Array<String>) {
	runApplication<SecurityApplication>(*args)
}
