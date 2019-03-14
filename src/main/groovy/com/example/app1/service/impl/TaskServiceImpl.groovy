package com.example.app1.service.impl

import com.example.app1.entity.Task
import com.example.app1.service.TaskService
import com.example.app1.repository.TaskRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TaskServiceImpl implements TaskService {

  @Autowired
  private final TaskRepository taskRepository

  @Override
  List<Task> findAll() {
    taskRepository.findAll()
  }

  @Override
   Task findById(int id) {
    taskRepository.findById(id)
  }
}