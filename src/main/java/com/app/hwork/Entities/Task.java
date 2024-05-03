package com.app.hwork.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title", nullable = false, unique= true)
	private String title;
	
	@Column(name = "content", nullable = false)
	private String content;
	
	@Column(name= "state")
	private Boolean state = false;
	
	public Task (){
	}

	public Task(Long id, String title, String content, Boolean state) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.state = state;
	}
	public Task( String title, String content, Boolean state) {
		super();
		this.title = title;
		this.content = content;
		this.state = state;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", content=" + content + ", state=" + state + "]";
	}

}
