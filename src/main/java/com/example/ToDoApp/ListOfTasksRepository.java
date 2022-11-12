package com.example.ToDoApp;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ListOfTasksRepository extends JpaRepository<ListOfTasks, Long> {
}
