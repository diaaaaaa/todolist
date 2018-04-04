package at.refugeescode.todolist.initialise;


import at.refugeescode.todolist.persistence.model.Todolist;
import at.refugeescode.todolist.persistence.repository.TodoListRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class TodoListInitialiser {

    @Bean
    ApplicationRunner initialiseApplicants(TodoListRepository todoListRepository) {
        return args -> {
            todoListRepository.deleteAll();
            List<Todolist> todolists = createTodolist();
            todoListRepository.saveAll(todolists);

            System.out.println("All todolists:");
            todoListRepository.findAll()
                    .forEach(System.out::println);
        };
    }

    private List<Todolist> createTodolist() {
        return Stream.of(
                new Todolist("task 1: Do homework",true),
                new Todolist("task10",true),
                new Todolist("task 2: Play football", false),
                new Todolist("task 3: Study German", true),
                new Todolist("task 4: Go to shopping", false),
                new Todolist("task 5: Call your Mom", true),
                new Todolist("task 6: Sleep", false)
        ).collect(Collectors.toList());
    }



}
