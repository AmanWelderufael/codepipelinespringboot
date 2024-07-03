package com.TaskManagement.demo.Service;

import com.TaskManagement.demo.Entity.Task;

import java.util.List;

public interface TaskService {

   List<Task> listAllTask();
   Task getTaskById(Long id);
   Task createTask(Task task);
   Task updateTask(Task task);
   void deleteTask (Task task);

}
