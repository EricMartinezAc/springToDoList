package com.app.hwork.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.hwork.Entities.Task;
import com.app.hwork.Services.TaskServices;

@Controller
public class TaskController {
	@Autowired
	private TaskServices service;

	@GetMapping({ "/Task", "/" })
	public String ListTask(Model modeloTask) {
		modeloTask.addAttribute("task", service.listadoDeTareas());
		return "index";
	}

	@GetMapping("/Task/new")
	public String CreateTaskForm(Model modelo) {
		Task task = new Task();
		modelo.addAttribute("task", task);
		return "createTask";
	}

	@PostMapping("/Task/new")
	public String SaveTask(@ModelAttribute("task") Task task) {
		service.saveTask(task);
		return "redirect:/Task";
	}

	@GetMapping("/Task/update/{id}")
	public String UpdateTaskForm(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("task", service.taskById(id));
		return "updateTask";
	}

	@PostMapping("/Task/update/{id}")
	public String UpdateTask(@PathVariable Long id, @ModelAttribute("task") Task task, Model modelo) {
		Task taskExist = service.taskById(id);
		taskExist.setTitle(task.getTitle());
		taskExist.setContent(task.getContent());
		taskExist.setState(task.getState());

		service.saveTask(taskExist);
		return "redirect:/Task";
	}

	@GetMapping("/Task/delete/{id}")
	public String DeleteTask(@PathVariable Long id) {
		service.deleteTask(id);
		return "redirect:/Task";
	}

}
