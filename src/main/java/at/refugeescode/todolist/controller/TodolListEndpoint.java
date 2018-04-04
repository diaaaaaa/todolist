package at.refugeescode.todolist.controller;

import at.refugeescode.todolist.persistence.model.Todolist;
import at.refugeescode.todolist.persistence.repository.TodoListRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TodolListEndpoint {

    private TodoListRepository todoListRepository;

    public TodolListEndpoint(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @GetMapping
    List<Todolist> findAll() {
        return todoListRepository.findAll();
    }

    @PostMapping
    Todolist save(@RequestBody Todolist todolist) {
        return todoListRepository.save(todolist);
    }

//    @GetMapping("/{title}")
//    Todolist findOneByTitle(@PathVariable String title) {
//        return todoListRepository.findOneByTitle(title)
//                .orElse(null);
//    }
    @GetMapping("/{title}")
    void deleteByTitle(@PathVariable String title) {
        todoListRepository.deleteByTitle(title);
    }



}
