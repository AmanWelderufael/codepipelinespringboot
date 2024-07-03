package com.TaskManagement.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task_management_table")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "taskName")
    private String taskName;

    @Column(nullable = false, name = "taskDescription")
    private String taskDescription;

    @Column(name = "isCompleted")
    private Boolean isCompleted;

    public Task() {
    }

    public Task(Long id, String taskName, String taskDescription, Boolean isCompleted) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isCompleted = isCompleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
