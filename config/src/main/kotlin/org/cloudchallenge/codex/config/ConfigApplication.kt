package org.cloudchallenge.codex.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConfigApplication

fun main(args: Array<String>) {
	runApplication<ConfigApplication>(*args)
}