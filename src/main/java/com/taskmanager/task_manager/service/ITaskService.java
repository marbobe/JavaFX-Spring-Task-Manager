package com.taskmanager.task_manager.service;

import com.taskmanager.task_manager.model.Task;

import java.util.List;

public interface ITaskService {
    public List<Task> listTasks();

    public Task searchTaskById(Integer id);

    public void saveTask(Task task);

    public void deleteTask(Task task);

}
