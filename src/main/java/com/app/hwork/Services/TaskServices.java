package com.app.hwork.Services;

import java.util.List;

import com.app.hwork.Entities.Task;

public interface TaskServices {

	public List<Task> listadoDeTareas();
	public Task saveTask(Task task);
	public Task taskById(Long id);
	public Task updateTask(Task task);
	public void deleteTask(Long id);
}
