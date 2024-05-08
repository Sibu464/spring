package com.congo.todo.service;
import com.congo.todo.entity.Todo;
import com.congo.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepo todoRepo;

   @Override
    public List<Todo> getAllTodo(){
       return todoRepo.findAll();
   }

    @Override
    public void saveTodo(Todo todo) {

    }

    @Override
    public Todo updateTodo(Long id, Todo todo) {

       Todo todoFromDb=todoRepo.findById(id).get();
       todoFromDb.setTaskname(todo.());
       todoFromDb.setDesc(todo.getDesc());
       todoRepo.save(todoFromDb);
       return null;
    }

    @Override
    public Todo getTodoById(Long id) {
        Optional<Todo> optional =todoRepo.findById(id);
        Todo todo;
        if(optional.isPresent()){

        }
        return null;
    }

    @Override
    public void deleteTodo(Long id) {

    }
}
