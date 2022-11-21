package com.example.ToDoApp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "ListOfTasks")
public class ListOfTasks {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    @OneToMany
    private List<ListItem> itemsOnBoard;

    public ListOfTasks(){}
    public ListOfTasks(String text){
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<ListItem> getItemsOnBoard() {
        return itemsOnBoard;
    }

    public void setItemsOnBoard(List<ListItem> itemsOnBoard) {
        this.itemsOnBoard = itemsOnBoard;
    }
}
