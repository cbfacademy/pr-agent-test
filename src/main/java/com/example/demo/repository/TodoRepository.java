package com.example.demo.repository;

import com.example.demo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
    // Custom query methods
    List<Todo> findByCompleted(boolean completed);
    
    List<Todo> findByPriority(String priority);
    
    List<Todo> findByTitleContaining(String keyword);
    
    List<Todo> findByCompletedAndPriority(boolean completed, String priority);
} 