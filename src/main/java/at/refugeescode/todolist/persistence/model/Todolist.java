package at.refugeescode.todolist.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Todolist {

    @Id
    private String id;
    private String title;
    private boolean itemDone;

    public Todolist() {
    }

    public Todolist(String title, boolean itemDone) {
        this.title = title;
        this.itemDone = itemDone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isItemDone() {
        return itemDone;
    }

    public void setItemDone(boolean itemDone) {
        this.itemDone = itemDone;
    }

    @Override
    public String toString() {
        return "Todolist{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", itemDone=" + itemDone +
                '}';
    }
}
