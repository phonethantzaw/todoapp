package cs545.lab.todoapp.service;

import cs545.lab.todoapp.model.Todo;

import java.util.List;

public interface TodoService {
    Todo save(Todo todo);

    List<Todo> findAll();

    Todo findById(long id);

    void delete(long id);

}
