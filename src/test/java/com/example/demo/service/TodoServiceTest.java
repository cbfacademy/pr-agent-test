package com.example.todos.service;

import com.example.todos.exception.TodoNotFoundException;
import com.example.todos.model.Todo;
import com.example.todos.repository.TodoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class TodoServiceTest {
    
    @Mock
    private TodoRepository todoRepository;
    
    @InjectMocks
    private TodoService todoService;
    
    private Todo todo1;
    private Todo todo2;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        
        todo1 = new Todo("Test Todo 1", "Description 1", "HIGH");
        todo1.setId(1L);
        
        todo2 = new Todo("Test Todo 2", "Description 2", "MEDIUM");
        todo2.setId(2L);
    }
    
    @Test
    void testCreateTodo() {
        when(todoRepository.save(any(Todo.class))).thenReturn(todo1);
        
        Todo createdTodo = todoService.createTodo(todo1);
        
        assertNotNull(createdTodo);
        assertEquals(todo1.getTitle(), createdTodo.getTitle());
        verify(todoRepository, times(1)).save(any(Todo.class));
    }
    
    @Test
    void testGetAllTodos() {
        when(todoRepository.findAll()).thenReturn(Arrays.asList(todo1, todo2));
        
        List<Todo> todos = todoService.getAllTodos();
        
        assertNotNull(todos);
        assertEquals(2, todos.size());
        verify(todoRepository, times(1)).findAll();
    }
    
    @Test
    void testGetTodoById() {
        when(todoRepository.findById(1L)).thenReturn(Optional.of(todo1));
        
        Todo foundTodo = todoService.getTodoById(1L);
        
        assertNotNull(foundTodo);
        assertEquals(todo1.getId(), foundTodo.getId());
        verify(todoRepository, times(1)).findById(1L);
    }
    
    @Test
    void testGetTodoByIdNotFound() {
        when(todoRepository.findById(3L)).thenReturn(Optional.empty());
        
        assertThrows(TodoNotFoundException.class, () -> {
            todoService.getTodoById(3L);
        });
        
        verify(todoRepository, times(1)).findById(3L);
    }
    
    @Test
    void testUpdateTodo() {
        Todo updatedTodo = new Todo("Updated Todo", "Updated Description", "LOW");
        
        when(todoRepository.findById(1L)).thenReturn(Optional.of(todo1));
        when(todoRepository.save(any(Todo.class))).thenReturn(updatedTodo);
        
        Todo result = todoService.updateTodo(1L, updatedTodo);
        
        assertNotNull(result);
        assertEquals(updatedTodo.getTitle(), result.getTitle());
        assertEquals(updatedTodo.getDescription(), result.getDescription());
        verify(todoRepository, times(1)).findById(1L);
        verify(todoRepository, times(1)).save(any(Todo.class));
    }
    
    @Test
    void testDeleteTodo() {
        when(todoRepository.findById(1L)).thenReturn(Optional.of(todo1));
        doNothing().when(todoRepository).delete(any(Todo.class));
        
        todoService.deleteTodo(1L);
        
        verify(todoRepository, times(1)).findById(1L);
        verify(todoRepository, times(1)).delete(any(Todo.class));
    }
    
    @Test
    void testFindByCompleted() {
        when(todoRepository.findByCompleted(false)).thenReturn(Arrays.asList(todo1, todo2));
        
        List<Todo> todos = todoService.findByCompleted(false);
        
        assertNotNull(todos);
        assertEquals(2, todos.size());
        verify(todoRepository, times(1)).findByCompleted(false);
    }
} 