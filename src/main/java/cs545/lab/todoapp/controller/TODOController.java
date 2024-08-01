package cs545.lab.todoapp.controller;

import cs545.lab.todoapp.model.Todo;
import cs545.lab.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todos")
public class TODOController {

    @Autowired
    private TodoService todoService;


    @GetMapping
    public ResponseEntity<?> getTodos(@RequestParam(required = false) Integer id) {
        if (id != null) {
            return ResponseEntity.ok(todoService.findById(Long.valueOf(id)));
        } else {
            return ResponseEntity.ok(todoService.findAll());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable("id") Integer id) {
        todoService.delete(Long.valueOf(id));
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> addTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.save(todo));
    }

    @PutMapping
    public ResponseEntity<?> updateTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.save(todo));
    }


}
