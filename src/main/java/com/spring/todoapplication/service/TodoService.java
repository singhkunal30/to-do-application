package com.spring.todoapplication.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.todoapplication.model.Todo;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList();
	
	private static int todosCount = 0;
	static {
		todos.add(new Todo(++todosCount, "kunal", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "kunal", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "kunal", "Learn AWS", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		todos.add(new Todo(++todosCount, username, description, targetDate, false));
	}
}
