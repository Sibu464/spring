package com.congo.todo.service;
import com.congo.todo.entity.Todo;
import java.util.List;

public interface TodoService
{
    List <Todo> getAllTodo();
    void saveTodo(Todo todo);
    Todo updateTodo(Long id,Todo todo);
    Todo getTodoById(Long id);
    void deleteTodo(Long id);



}
