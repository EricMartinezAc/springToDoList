package com.app.hwork.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.hwork.Entities.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

}
