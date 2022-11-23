package com.example.ToDoApp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ListItem")
public class ListItem {
    @Id
    @GeneratedValue(generator = "itemGenerator")
    private Long id;
    private String title;
    private String text;
    private boolean completed;
    private long listOfTasksId;
    public ListItem(){}
    public ListItem(String title, String text, Long listOfTasksId){
        this.text = text;
        this.title = title;
        this.listOfTasksId = listOfTasksId;
    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getText() {return text;}
    public void setText(String text) {this.text = text;}
    public boolean isCompleted() {return completed;}
    public void setCompleted(boolean completed) {this.completed = completed;}
    public long getListOfTasksId() {return listOfTasksId;}
    public void setListOfTasksId(long listOfTasksId) {this.listOfTasksId = listOfTasksId;}
}
