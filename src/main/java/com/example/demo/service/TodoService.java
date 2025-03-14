package com.example.demo.service;

import com.example.demo.exception.TodoNotFoundException;
import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    
    private final TodoRepository todoRepository;
    
    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    
    // Create a new todo
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }
    
    // Get all todos
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }
    
    // Get todo by id
    public Todo getTodoById(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new TodoNotFoundException(id));
    }
    
    // Update todo
    public Todo updateTodo(Long id, Todo todoDetails) {
        Todo todo = getTodoById(id);
        
        todo.setTitle(todoDetails.getTitle());
        todo.setDescription(todoDetails.getDescription());
        todo.setCompleted(todoDetails.isCompleted());
        todo.setPriority(todoDetails.getPriority());
        todo.updateTimestamp();
        
        return todoRepository.save(todo);
    }
    
    // Delete todo
    public void deleteTodo(Long id) {
        Todo todo = getTodoById(id);
        todoRepository.delete(todo);
    }
    
    // Find todos by completion status
    public List<Todo> findByCompleted(boolean completed) {
        return todoRepository.findByCompleted(completed);
    }
    
    // Find todos by priority
    public List<Todo> findByPriority(String priority) {
        return todoRepository.findByPriority(priority);
    }
    
    // Find todos by title containing keyword
    public List<Todo> findByTitleContaining(String keyword) {
        return todoRepository.findByTitleContaining(keyword);
    }
    
    // Find todos by completion status and priority
    public List<Todo> findByCompletedAndPriority(boolean completed, String priority) {
        return todoRepository.findByCompletedAndPriority(completed, priority);
    }
} 