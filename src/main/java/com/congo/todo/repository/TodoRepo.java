package com.congo.todo.repository;

import com.congo.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo  extends JpaRepository<Todo, Long> {
}
