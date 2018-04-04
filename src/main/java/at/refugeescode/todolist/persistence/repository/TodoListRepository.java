package at.refugeescode.todolist.persistence.repository;


import at.refugeescode.todolist.persistence.model.Todolist;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface TodoListRepository extends MongoRepository<Todolist, String> {

    List<Todolist> findByItemDone(boolean itemDone);

    Optional<Todolist> findOneByTitle(String title);

    void deleteByTitle(String itemDone);
}
