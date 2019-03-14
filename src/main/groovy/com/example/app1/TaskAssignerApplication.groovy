package com.example.app1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TaskAssignerApplication {

	static void main(String[] args) {
		SpringApplication.run(TaskAssignerApplication, args)
	}

}