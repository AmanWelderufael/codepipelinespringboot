package com.TaskManagement.demo.Repository;

import com.TaskManagement.demo.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
//Repository class extending CRUD Services
