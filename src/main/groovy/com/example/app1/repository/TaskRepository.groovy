package com.example.app1.repository

import com.example.app1.entity.Task
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository extends JpaRepository<Task, Integer> {

  List<Task> findAll()

  Task findById(Integer id)
}