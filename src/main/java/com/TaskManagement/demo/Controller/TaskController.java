package com.TaskManagement.demo.Controller;

import com.TaskManagement.demo.Entity.Task;
import com.TaskManagement.demo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService service;

    @GetMapping
    public List<Task> listAllTask(){
        return service.listAllTask();
    }

@GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id){
        return service.getTaskById(id);
}

    @PostMapping
    public Task createTask(@RequestBody Task task){
        return service.createTask(task);
}
    // Update
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task taskDetails){

        Task task = service.getTaskById(id);
        if(task != null){
           task.setTaskName(task.getTaskName());
           task.setTaskDescription(task.getTaskDescription());
           task.setCompleted(task.getCompleted());
           return service.updateTask(taskDetails);
        }
        return null;
    }

    //Delete
    @DeleteMapping
    public void deleteTask(Task task){
        service.deleteTask(task);
    }


}
