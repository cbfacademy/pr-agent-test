package com.example.todos.controller;

import com.example.todos.model.Todo;
import com.example.todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    
    private final TodoService todoService;
    
    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    
    // Create a new todo
    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }
    
    // Get all todos
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
    
    // Get todo by id
    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Todo todo = todoService.getTodoById(id);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }
    
    // Update todo
    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {
        Todo updatedTodo = todoService.updateTodo(id, todoDetails);
        return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
    }
    
    // Delete todo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    // Get todos by completion status
    @GetMapping("/completed")
    public ResponseEntity<List<Todo>> getTodosByCompletionStatus(@RequestParam boolean status) {
        List<Todo> todos = todoService.findByCompleted(status);
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
    
    // Get todos by priority
    @GetMapping("/priority/{priority}")
    public ResponseEntity<List<Todo>> getTodosByPriority(@PathVariable String priority) {
        List<Todo> todos = todoService.findByPriority(priority);
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
    
    // Get todos by title containing keyword
    @GetMapping("/search")
    public ResponseEntity<List<Todo>> searchTodosByTitle(@RequestParam String keyword) {
        List<Todo> todos = todoService.findByTitleContaining(keyword);
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
    
    // Get todos by completion status and priority
    @GetMapping("/filter")
    public ResponseEntity<List<Todo>> filterTodos(
            @RequestParam boolean completed,
            @RequestParam String priority) {
        List<Todo> todos = todoService.findByCompletedAndPriority(completed, priority);
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
} 