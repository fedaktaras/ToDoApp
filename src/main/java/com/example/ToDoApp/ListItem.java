package com.example.ToDoApp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ListItem")
public class ListItem {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String text;
    private boolean completed;

    public ListItem(){}
    public ListItem(String title, String text){
        this.text = text;
        this.title = title;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getText() {return text;}

    public void setText(String text) {this.text = text;}

    public boolean isCompleted() {return completed;}

    public void setCompleted(boolean completed) {this.completed = completed;}
}
