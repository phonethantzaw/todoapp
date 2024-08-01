package cs545.lab.todoapp.service;

import cs545.lab.todoapp.model.Todo;
import cs545.lab.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo save(Todo todo) {
        if (todoRepository.existsById(todo.getId())) {
            Todo existingTodo = todoRepository.findById(todo.getId()).get();
            existingTodo.setTitle(todo.getTitle());
            existingTodo.setDescription(todo.getDescription());
            todoRepository.save(existingTodo);
            return existingTodo;
        }
        return todoRepository.save(todo);
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo findById(long id) {
        if (todoRepository.existsById(id)) {
            return todoRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(long id) {
        if (todoRepository.existsById(id)) {
            todoRepository.deleteById(id);
        }
    }
}
