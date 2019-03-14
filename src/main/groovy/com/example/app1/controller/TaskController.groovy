package com.example.app1.controller

import com.example.app1.entity.Task


import com.example.app1.service.TaskService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.PathVariable

@RestController
@RequestMapping('/tasks')
class TaskController {

  @Autowired
  private final TaskService taskService

  @RequestMapping(method = RequestMethod.GET)
  List<Task> findAll() {
    taskService.findAll()
  }

  @RequestMapping(value = '/{id}', method = RequestMethod.GET)
  Task findById(@PathVariable('id') int id) {
    taskService.findById id
  }
}
