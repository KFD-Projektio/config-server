package ru.projektioserverconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ProjektioServerConfigApplication

fun main(args: Array<String>) {
    runApplication<ProjektioServerConfigApplication>(*args)
}
