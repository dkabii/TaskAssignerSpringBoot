package com.example.app1.service

import com.example.app1.entity.Task

interface TaskService {

  List<Task> findAll()

  Task findById(int id)
}