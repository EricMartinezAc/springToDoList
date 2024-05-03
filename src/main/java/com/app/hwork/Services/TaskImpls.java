package com.app.hwork.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.hwork.Entities.Task;
import com.app.hwork.repo.TaskRepo;

@Service
public class TaskImpls implements TaskServices {

	@Autowired
	private TaskRepo repo;
	
	@Override
	public List<Task> listadoDeTareas() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Task saveTask(Task task) {
		// TODO Auto-generated method stub
		return repo.save(task);
	}

	@Override
	public Task taskById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Task updateTask(Task task) {
		// TODO Auto-generated method stub
		return repo.save(task);
	}

	@Override
	public void deleteTask(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
