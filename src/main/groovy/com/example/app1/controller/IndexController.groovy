package com.example.app1.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@RestController
@RequestMapping('/')
class IndexController {

  @RequestMapping(method = RequestMethod.GET)
  String index() {
   "<h3>Task Assigner</h3> Navigate to /tasks"
  }

}
