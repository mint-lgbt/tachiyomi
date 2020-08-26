package com.lunaisnotaboy.tachiyomi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TachiyomiApplication

fun main(args: Array<String>) {
	runApplication<TachiyomiApplication>(*args)
}
