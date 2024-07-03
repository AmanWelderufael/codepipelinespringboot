package com.TaskManagement.demo.Service;

import com.TaskManagement.demo.Entity.Task;
import com.TaskManagement.demo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImlp implements TaskService{

    @Autowired //depedency inject
    TaskRepository repository;

    @Override
    public List<Task> listAllTask() {
        return repository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return repository.getById(id);
    }

    @Override
    public Task createTask(Task task) {
        return repository.save(task);
    }

    @Override
    public Task updateTask(Task task) {
        return repository.save(task);
    }

    @Override
    public void deleteTask(Task task) {
    repository.delete(task);
    }
}
